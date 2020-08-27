grammar tal_sql;

SELECT : 'vouloir';

ARTICLE : 'article'
;

BULLETIN : 'bulletin'
;

CONJ : 'et' | 'ou'
;

POINT : '.'
;

MOT : 'mot' | 'contenir' | 'parler'
;

RUBRIQUE : 'rubrique'
;

DATE : 'date'
;

JOUR : ('0'..'3')('0'..'9')
;

/*MOIS : ('0'..'2')('0'..'9')
;*/

ANNEE : ('0'..'2')('0'..'9')('0'..'9')('0'..'9')
;

NUMERO : 'numero'
;

CONDITION : 'condition'
;

SIGN 	: 'inferieur' | 'superieur' | 'avant' | 'apres'
;
 
WS  : (' ' |'\t' | '\r' | 'je' | 'qui' | 'dont') {skip();} | '\n' 
;

VAR 	: ('A'..'Z' | 'a'..'z') ('a'..'z')+
;

NUM 	: ('0'..'9')+
;



listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete (POINT)?
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre,cond1_arbre,cond2_arbre;} : 
		SELECT 
			{
				req_arbre.ajouteFils(new Arbre("","select distinct"));
			} 
		(ARTICLE
			{
			req_arbre.ajouteFils(new Arbre("","fichier "));
			}
		 | BULLETIN
			{
			req_arbre.ajouteFils(new Arbre("","bulletin "));
			}
		 | RUBRIQUE
			{
			req_arbre.ajouteFils(new Arbre("","rubrique from public.rubrique r"));
			}
		 | DATE
			{
			req_arbre.ajouteFils(new Arbre("","date "));
			}
			
				)
		(cond1 = condition
			{
				//if($cond1.cond_arbre.mot != null){req_arbre.ajouteFils(new Arbre("","titreresume tr"));}
				//if($cond1.cond_arbre.pdates != null){req_arbre.ajouteFils(new Arbre("","public.date d"));}
				cond1_arbre = $cond1.cond_arbre;
				req_arbre.ajouteFils(cond1_arbre);
				
			}
		(CONJ cond2 = condition
			{
				cond2_arbre = $cond2.cond_arbre;
				req_arbre.ajouteFils(new Arbre("", ","));
				req_arbre.ajouteFils(cond2_arbre);
			}
		)*
		
		)
;
condition returns [Arbre cond_arbre = new Arbre("")]
	@init {Arbre mot_arbre, rub_arbre, pdates_arbre, pnums_arbre;} : 	
		MOT
			{
				cond_arbre.ajouteFils(new Arbre("","from public.titretexte tt"));
				cond_arbre.ajouteFils(new Arbre("","where"));
			}
		ps = params 
			{
				mot_arbre = $ps.les_pars_arbre;
				cond_arbre.ajouteFils(mot_arbre);
			}
		| RUBRIQUE
			{
				cond_arbre.ajouteFils(new Arbre("","from public.rubrique r"));
				cond_arbre.ajouteFils(new Arbre("","where"));
			}
		prubs = pararubs 
			{
				rub_arbre = $prubs.les_pararubs_arbre;
				cond_arbre.ajouteFils(rub_arbre);
			}
		| DATE
			{
				cond_arbre.ajouteFils(new Arbre("","from public.date d"));
				cond_arbre.ajouteFils(new Arbre("","where"));
			}
		pdates = paradates 
			{
				pdates_arbre = $pdates.les_paradates_arbre;
				cond_arbre.ajouteFils(pdates_arbre);
			}
		| NUMERO
			{
				cond_arbre.ajouteFils(new Arbre("","from public.titretexte tt"));
				cond_arbre.ajouteFils(new Arbre("","where"));
			}
		pnums = paranums 
			{
				pnums_arbre = $pnums.les_paranums_arbre;
				cond_arbre.ajouteFils(pnums_arbre);
			}
;

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(CONJ par2 = param
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

param returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR
		{ lepar_arbre.ajouteFils(new Arbre("tt.mot =", "'"+a.getText()+"'"));}
;

paranums returns [Arbre les_paranums_arbre = new Arbre("")]
	@init	{Arbre paranum1_arbre,paranum2_arbre;} : 
		paranum1 = paranum
			{
				paranum1_arbre = $paranum1.leparanum_arbre;
				les_paranums_arbre.ajouteFils(paranum1_arbre);
			}
		(cj=CONJ paranum2 = paranum
			{
				paranum2_arbre = $paranum2.leparanum_arbre;
				if($cj.getText().equals("et")){
					les_paranums_arbre.ajouteFils(new Arbre("", "AND"));
				}else{
					les_paranums_arbre.ajouteFils(new Arbre("", "OR"));
				}
				les_paranums_arbre.ajouteFils(paranum2_arbre);
			}
		)*
;

paranum returns [Arbre leparanum_arbre = new Arbre("")] :
	(s=SIGN)? a = NUM 
		{ 
			if($s!=null){
				if($s.getText().equals("inferieur")){
					leparanum_arbre.ajouteFils(new Arbre("numero <", "'"+a.getText()+"'"));
				}else if ($s.getText().equals("superieur")){
					leparanum_arbre.ajouteFils(new Arbre("numero >", "'"+a.getText()+"'"));
			}}else {
				leparanum_arbre.ajouteFils(new Arbre("numero =", "'"+a.getText()+"'"));
			}
		}
;
paradates returns [Arbre les_paradates_arbre = new Arbre("")]
	@init	{Arbre paradate1_arbre,paradate2_arbre;} : 
		paradate1 = paradate
			{
				paradate1_arbre = $paradate1.leparadate_arbre;
				les_paradates_arbre.ajouteFils(paradate1_arbre);
			}
		(CONJ paradate2 = paradate
			{
				paradate2_arbre = $paradate2.leparadate_arbre;
				les_paradates_arbre.ajouteFils(new Arbre("", "OR"));
				les_paradates_arbre.ajouteFils(paradate2_arbre);
			}
		)*
;

paradate returns [Arbre leparadate_arbre = new Arbre("")] 
	@init	{Arbre jr_arbre, ae_arbre;} : 
	(jr=parajour
		{ 
			jr_arbre = $jr.leparajour_arbre;
			//leparadate_arbre.ajouteFils(new Arbre("", "OR"));
			leparadate_arbre.ajouteFils(jr_arbre);
		})?
	
	 /*ms=paramois
		{ 
			ms_arbre = $ms.leparamois_arbre;
			leparadate_arbre.ajouteFils(new Arbre("", "OR"));
			leparadate_arbre.ajouteFils(ms_arbre);
		}
	)?*/
	 ae=paraannee
		{ 
			ae_arbre = $ae.leparaannee_arbre;
			leparadate_arbre.ajouteFils(ae_arbre);
		}
;

parajour returns [Arbre leparajour_arbre = new Arbre("")] :
	(j = JOUR)? m = JOUR
		{ 
			if(j!=null){
				leparajour_arbre.ajouteFils(new Arbre("d.jour =", "'"+j.getText()+"'"));
				leparajour_arbre.ajouteFils(new Arbre("", "AND"));
			}
			
			leparajour_arbre.ajouteFils(new Arbre("d.mois =", "'"+m.getText()+"'"));
			leparajour_arbre.ajouteFils(new Arbre("", "AND"));
		}
;

/*paramois returns [Arbre leparamois_arbre = new Arbre("")] :
	m = MOIS
		{ leparamois_arbre.ajouteFils(new Arbre("mois =", "'"+m.getText()+"'"));}
;*/

paraannee returns [Arbre leparaannee_arbre = new Arbre("")] :
	(s=SIGN)? a = ANNEE
		{ 
			if($s!=null){
				if($s.getText().equals("avant")){
					leparaannee_arbre.ajouteFils(new Arbre("d.annee <", "'"+a.getText()+"'"));
				}else if ($s.getText().equals("apres")){
					leparaannee_arbre.ajouteFils(new Arbre("d.annee >", "'"+a.getText()+"'"));
			}}else {
				leparaannee_arbre.ajouteFils(new Arbre("d.annee =", "'"+a.getText()+"'"));
			}
		}
;

pararubs returns [Arbre les_pararubs_arbre = new Arbre("")]
	@init	{Arbre pararub1_arbre, pararub2_arbre;} : 
		(pararub1 = pararub 
		
			{
				pararub1_arbre = $pararub1.lepararub_arbre;
				les_pararubs_arbre.ajouteFils(pararub1_arbre);
			}
		(CONJ pararub2 = pararub
			{
				pararub2_arbre = $pararub2.lepararub_arbre;
				les_pararubs_arbre.ajouteFils(new Arbre("", "OR"));
				les_pararubs_arbre.ajouteFils(pararub2_arbre);
			}
			
		)*)+	
;

pararub returns [Arbre lepararub_arbre = new Arbre("")] :
	a = VAR (b=VAR)? (c=VAR)? 
		{ 
			if($b!=null){
				if($c!=null){
					lepararub_arbre.ajouteFils(new Arbre("r.rubrique =", "'"+a.getText()+" "+b.getText()+" "+c.getText()+"'"));
				}else{
					lepararub_arbre.ajouteFils(new Arbre("r.rubrique =", "'"+a.getText()+" "+b.getText()+"'"));
				}
			}else{
				lepararub_arbre.ajouteFils(new Arbre("r.rubrique =", "'"+a.getText()+"'"));
			}
		}
;


/*paranum returns [Arbre leparanum_arbre = new Arbre("")] :
	a = VAR
		{ leparanum_arbre.ajouteFils(new Arbre("numero =", "'"+a.getText()+"'"));}
;*/