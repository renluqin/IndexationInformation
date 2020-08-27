// $ANTLR 3.5.1 E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g 2019-12-13 09:22:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "ARTICLE", "BULLETIN", 
		"CONDITION", "CONJ", "DATE", "JOUR", "MOT", "NUM", "NUMERO", "POINT", 
		"RUBRIQUE", "SELECT", "SIGN", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int ARTICLE=5;
	public static final int BULLETIN=6;
	public static final int CONDITION=7;
	public static final int CONJ=8;
	public static final int DATE=9;
	public static final int JOUR=10;
	public static final int MOT=11;
	public static final int NUM=12;
	public static final int NUMERO=13;
	public static final int POINT=14;
	public static final int RUBRIQUE=15;
	public static final int SELECT=16;
	public static final int SIGN=17;
	public static final int VAR=18;
	public static final int WS=19;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tal_sqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return tal_sqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:55:1: listerequetes returns [String sql = \"\"] : r= requete ( POINT )? ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:56:25: (r= requete ( POINT )? )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:57:3: r= requete ( POINT )?
			{
			pushFollow(FOLLOW_requete_in_listerequetes281);
			r=requete();
			state._fsp--;

			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:57:15: ( POINT )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==POINT) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:57:16: POINT
					{
					match(input,POINT,FOLLOW_POINT_in_listerequetes284); 
					}
					break;

			}


							lr_arbre = r;
							sql = lr_arbre.sortArbre();
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "requete"
	// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:64:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ( ARTICLE | BULLETIN | RUBRIQUE | DATE ) (cond1= condition ( CONJ cond2= condition )* ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre cond1 =null;
		Arbre cond2 =null;

		Arbre ps_arbre,cond1_arbre,cond2_arbre;
		try {
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:65:50: ( SELECT ( ARTICLE | BULLETIN | RUBRIQUE | DATE ) (cond1= condition ( CONJ cond2= condition )* ) )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:66:3: SELECT ( ARTICLE | BULLETIN | RUBRIQUE | DATE ) (cond1= condition ( CONJ cond2= condition )* )
			{
			match(input,SELECT,FOLLOW_SELECT_in_requete313); 

							req_arbre.ajouteFils(new Arbre("","select distinct"));
						
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:70:3: ( ARTICLE | BULLETIN | RUBRIQUE | DATE )
			int alt2=4;
			switch ( input.LA(1) ) {
			case ARTICLE:
				{
				alt2=1;
				}
				break;
			case BULLETIN:
				{
				alt2=2;
				}
				break;
			case RUBRIQUE:
				{
				alt2=3;
				}
				break;
			case DATE:
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:70:4: ARTICLE
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete325); 

								req_arbre.ajouteFils(new Arbre("","fichier "));
								
					}
					break;
				case 2 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:74:6: BULLETIN
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete337); 

								req_arbre.ajouteFils(new Arbre("","bulletin "));
								
					}
					break;
				case 3 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:78:6: RUBRIQUE
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete349); 

								req_arbre.ajouteFils(new Arbre("","rubrique from public.rubrique r"));
								
					}
					break;
				case 4 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:82:6: DATE
					{
					match(input,DATE,FOLLOW_DATE_in_requete361); 

								req_arbre.ajouteFils(new Arbre("","date "));
								
					}
					break;

			}

			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:88:3: (cond1= condition ( CONJ cond2= condition )* )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:88:4: cond1= condition ( CONJ cond2= condition )*
			{
			pushFollow(FOLLOW_condition_in_requete385);
			cond1=condition();
			state._fsp--;


							//if(cond1.mot != null){req_arbre.ajouteFils(new Arbre("","titreresume tr"));}
							//if(cond1.pdates != null){req_arbre.ajouteFils(new Arbre("","public.date d"));}
							cond1_arbre = cond1;
							req_arbre.ajouteFils(cond1_arbre);
							
						
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:96:3: ( CONJ cond2= condition )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==CONJ) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:96:4: CONJ cond2= condition
					{
					match(input,CONJ,FOLLOW_CONJ_in_requete395); 
					pushFollow(FOLLOW_condition_in_requete401);
					cond2=condition();
					state._fsp--;


									cond2_arbre = cond2;
									req_arbre.ajouteFils(new Arbre("", ","));
									req_arbre.ajouteFils(cond2_arbre);
								
					}
					break;

				default :
					break loop3;
				}
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "condition"
	// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:106:1: condition returns [Arbre cond_arbre = new Arbre(\"\")] : ( MOT ps= params | RUBRIQUE prubs= pararubs | DATE pdates= paradates | NUMERO pnums= paranums );
	public final Arbre condition() throws RecognitionException {
		Arbre cond_arbre =  new Arbre("");


		Arbre ps =null;
		Arbre prubs =null;
		Arbre pdates =null;
		Arbre pnums =null;

		Arbre mot_arbre, rub_arbre, pdates_arbre, pnums_arbre;
		try {
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:107:65: ( MOT ps= params | RUBRIQUE prubs= pararubs | DATE pdates= paradates | NUMERO pnums= paranums )
			int alt4=4;
			switch ( input.LA(1) ) {
			case MOT:
				{
				alt4=1;
				}
				break;
			case RUBRIQUE:
				{
				alt4=2;
				}
				break;
			case DATE:
				{
				alt4=3;
				}
				break;
			case NUMERO:
				{
				alt4=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:108:3: MOT ps= params
					{
					match(input,MOT,FOLLOW_MOT_in_condition440); 

									cond_arbre.ajouteFils(new Arbre("","from public.titretexte tt"));
									cond_arbre.ajouteFils(new Arbre("","where"));
								
					pushFollow(FOLLOW_params_in_condition453);
					ps=params();
					state._fsp--;


									mot_arbre = ps;
									cond_arbre.ajouteFils(mot_arbre);
								
					}
					break;
				case 2 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:118:5: RUBRIQUE prubs= pararubs
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_condition465); 

									cond_arbre.ajouteFils(new Arbre("","from public.rubrique r"));
									cond_arbre.ajouteFils(new Arbre("","where"));
								
					pushFollow(FOLLOW_pararubs_in_condition478);
					prubs=pararubs();
					state._fsp--;


									rub_arbre = prubs;
									cond_arbre.ajouteFils(rub_arbre);
								
					}
					break;
				case 3 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:128:5: DATE pdates= paradates
					{
					match(input,DATE,FOLLOW_DATE_in_condition490); 

									cond_arbre.ajouteFils(new Arbre("","from public.date d"));
									cond_arbre.ajouteFils(new Arbre("","where"));
								
					pushFollow(FOLLOW_paradates_in_condition503);
					pdates=paradates();
					state._fsp--;


									pdates_arbre = pdates;
									cond_arbre.ajouteFils(pdates_arbre);
								
					}
					break;
				case 4 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:138:5: NUMERO pnums= paranums
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_condition515); 

									cond_arbre.ajouteFils(new Arbre("","from public.titretexte tt"));
									cond_arbre.ajouteFils(new Arbre("","where"));
								
					pushFollow(FOLLOW_paranums_in_condition528);
					pnums=paranums();
					state._fsp--;


									pnums_arbre = pnums;
									cond_arbre.ajouteFils(pnums_arbre);
								
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return cond_arbre;
	}
	// $ANTLR end "condition"



	// $ANTLR start "params"
	// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:150:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( CONJ par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:151:40: (par1= param ( CONJ par2= param )* )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:152:3: par1= param ( CONJ par2= param )*
			{
			pushFollow(FOLLOW_param_in_params560);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:157:3: ( CONJ par2= param )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CONJ) ) {
					int LA5_1 = input.LA(2);
					if ( (LA5_1==VAR) ) {
						alt5=1;
					}

				}

				switch (alt5) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:157:4: CONJ par2= param
					{
					match(input,CONJ,FOLLOW_CONJ_in_params571); 
					pushFollow(FOLLOW_param_in_params577);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params"



	// $ANTLR start "param"
	// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:166:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:166:51: (a= VAR )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:167:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param605); 
			 lepar_arbre.ajouteFils(new Arbre("tt.mot =", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param"



	// $ANTLR start "paranums"
	// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:171:1: paranums returns [Arbre les_paranums_arbre = new Arbre(\"\")] : paranum1= paranum (cj= CONJ paranum2= paranum )* ;
	public final Arbre paranums() throws RecognitionException {
		Arbre les_paranums_arbre =  new Arbre("");


		Token cj=null;
		Arbre paranum1 =null;
		Arbre paranum2 =null;

		Arbre paranum1_arbre,paranum2_arbre;
		try {
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:172:47: (paranum1= paranum (cj= CONJ paranum2= paranum )* )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:173:3: paranum1= paranum (cj= CONJ paranum2= paranum )*
			{
			pushFollow(FOLLOW_paranum_in_paranums635);
			paranum1=paranum();
			state._fsp--;


							paranum1_arbre = paranum1;
							les_paranums_arbre.ajouteFils(paranum1_arbre);
						
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:178:3: (cj= CONJ paranum2= paranum )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==CONJ) ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1==NUM||LA6_1==SIGN) ) {
						alt6=1;
					}

				}

				switch (alt6) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:178:4: cj= CONJ paranum2= paranum
					{
					cj=(Token)match(input,CONJ,FOLLOW_CONJ_in_paranums647); 
					pushFollow(FOLLOW_paranum_in_paranums653);
					paranum2=paranum();
					state._fsp--;


									paranum2_arbre = paranum2;
									if(cj.getText().equals("et")){
										les_paranums_arbre.ajouteFils(new Arbre("", "AND"));
									}else{
										les_paranums_arbre.ajouteFils(new Arbre("", "OR"));
									}
									les_paranums_arbre.ajouteFils(paranum2_arbre);
								
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_paranums_arbre;
	}
	// $ANTLR end "paranums"



	// $ANTLR start "paranum"
	// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:191:1: paranum returns [Arbre leparanum_arbre = new Arbre(\"\")] : (s= SIGN )? a= NUM ;
	public final Arbre paranum() throws RecognitionException {
		Arbre leparanum_arbre =  new Arbre("");


		Token s=null;
		Token a=null;

		try {
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:191:57: ( (s= SIGN )? a= NUM )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:192:2: (s= SIGN )? a= NUM
			{
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:192:2: (s= SIGN )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==SIGN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:192:3: s= SIGN
					{
					s=(Token)match(input,SIGN,FOLLOW_SIGN_in_paranum680); 
					}
					break;

			}

			a=(Token)match(input,NUM,FOLLOW_NUM_in_paranum688); 
			 
						if(s!=null){
							if(s.getText().equals("inferieur")){
								leparanum_arbre.ajouteFils(new Arbre("numero <", "'"+a.getText()+"'"));
							}else if (s.getText().equals("superieur")){
								leparanum_arbre.ajouteFils(new Arbre("numero >", "'"+a.getText()+"'"));
						}}else {
							leparanum_arbre.ajouteFils(new Arbre("numero =", "'"+a.getText()+"'"));
						}
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return leparanum_arbre;
	}
	// $ANTLR end "paranum"



	// $ANTLR start "paradates"
	// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:204:1: paradates returns [Arbre les_paradates_arbre = new Arbre(\"\")] : paradate1= paradate ( CONJ paradate2= paradate )* ;
	public final Arbre paradates() throws RecognitionException {
		Arbre les_paradates_arbre =  new Arbre("");


		Arbre paradate1 =null;
		Arbre paradate2 =null;

		Arbre paradate1_arbre,paradate2_arbre;
		try {
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:205:49: (paradate1= paradate ( CONJ paradate2= paradate )* )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:206:3: paradate1= paradate ( CONJ paradate2= paradate )*
			{
			pushFollow(FOLLOW_paradate_in_paradates718);
			paradate1=paradate();
			state._fsp--;


							paradate1_arbre = paradate1;
							les_paradates_arbre.ajouteFils(paradate1_arbre);
						
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:211:3: ( CONJ paradate2= paradate )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==CONJ) ) {
					int LA8_1 = input.LA(2);
					if ( (LA8_1==ANNEE||LA8_1==JOUR||LA8_1==SIGN) ) {
						alt8=1;
					}

				}

				switch (alt8) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:211:4: CONJ paradate2= paradate
					{
					match(input,CONJ,FOLLOW_CONJ_in_paradates728); 
					pushFollow(FOLLOW_paradate_in_paradates734);
					paradate2=paradate();
					state._fsp--;


									paradate2_arbre = paradate2;
									les_paradates_arbre.ajouteFils(new Arbre("", "OR"));
									les_paradates_arbre.ajouteFils(paradate2_arbre);
								
					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_paradates_arbre;
	}
	// $ANTLR end "paradates"



	// $ANTLR start "paradate"
	// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:220:1: paradate returns [Arbre leparadate_arbre = new Arbre(\"\")] : (jr= parajour )? ae= paraannee ;
	public final Arbre paradate() throws RecognitionException {
		Arbre leparadate_arbre =  new Arbre("");


		Arbre jr =null;
		Arbre ae =null;

		Arbre jr_arbre, ae_arbre;
		try {
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:221:36: ( (jr= parajour )? ae= paraannee )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:222:2: (jr= parajour )? ae= paraannee
			{
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:222:2: (jr= parajour )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==JOUR) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:222:3: jr= parajour
					{
					pushFollow(FOLLOW_parajour_in_paradate769);
					jr=parajour();
					state._fsp--;

					 
								jr_arbre = jr;
								//leparadate_arbre.ajouteFils(new Arbre("", "OR"));
								leparadate_arbre.ajouteFils(jr_arbre);
							
					}
					break;

			}

			pushFollow(FOLLOW_paraannee_in_paradate787);
			ae=paraannee();
			state._fsp--;

			 
						ae_arbre = ae;
						leparadate_arbre.ajouteFils(ae_arbre);
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return leparadate_arbre;
	}
	// $ANTLR end "paradate"



	// $ANTLR start "parajour"
	// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:243:1: parajour returns [Arbre leparajour_arbre = new Arbre(\"\")] : (j= JOUR )? m= JOUR ;
	public final Arbre parajour() throws RecognitionException {
		Arbre leparajour_arbre =  new Arbre("");


		Token j=null;
		Token m=null;

		try {
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:243:59: ( (j= JOUR )? m= JOUR )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:244:2: (j= JOUR )? m= JOUR
			{
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:244:2: (j= JOUR )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==JOUR) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==JOUR) ) {
					alt10=1;
				}
			}
			switch (alt10) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:244:3: j= JOUR
					{
					j=(Token)match(input,JOUR,FOLLOW_JOUR_in_parajour810); 
					}
					break;

			}

			m=(Token)match(input,JOUR,FOLLOW_JOUR_in_parajour818); 
			 
						if(j!=null){
							leparajour_arbre.ajouteFils(new Arbre("d.jour =", "'"+j.getText()+"'"));
							leparajour_arbre.ajouteFils(new Arbre("", "AND"));
						}
						
						leparajour_arbre.ajouteFils(new Arbre("d.mois =", "'"+m.getText()+"'"));
						leparajour_arbre.ajouteFils(new Arbre("", "AND"));
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return leparajour_arbre;
	}
	// $ANTLR end "parajour"



	// $ANTLR start "paraannee"
	// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:261:1: paraannee returns [Arbre leparaannee_arbre = new Arbre(\"\")] : (s= SIGN )? a= ANNEE ;
	public final Arbre paraannee() throws RecognitionException {
		Arbre leparaannee_arbre =  new Arbre("");


		Token s=null;
		Token a=null;

		try {
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:261:61: ( (s= SIGN )? a= ANNEE )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:262:2: (s= SIGN )? a= ANNEE
			{
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:262:2: (s= SIGN )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==SIGN) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:262:3: s= SIGN
					{
					s=(Token)match(input,SIGN,FOLLOW_SIGN_in_paraannee842); 
					}
					break;

			}

			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paraannee850); 
			 
						if(s!=null){
							if(s.getText().equals("avant")){
								leparaannee_arbre.ajouteFils(new Arbre("d.annee <", "'"+a.getText()+"'"));
							}else if (s.getText().equals("apres")){
								leparaannee_arbre.ajouteFils(new Arbre("d.annee >", "'"+a.getText()+"'"));
						}}else {
							leparaannee_arbre.ajouteFils(new Arbre("d.annee =", "'"+a.getText()+"'"));
						}
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return leparaannee_arbre;
	}
	// $ANTLR end "paraannee"



	// $ANTLR start "pararubs"
	// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:275:1: pararubs returns [Arbre les_pararubs_arbre = new Arbre(\"\")] : (pararub1= pararub ( CONJ pararub2= pararub )* )+ ;
	public final Arbre pararubs() throws RecognitionException {
		Arbre les_pararubs_arbre =  new Arbre("");


		Arbre pararub1 =null;
		Arbre pararub2 =null;

		Arbre pararub1_arbre, pararub2_arbre;
		try {
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:276:48: ( (pararub1= pararub ( CONJ pararub2= pararub )* )+ )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:277:3: (pararub1= pararub ( CONJ pararub2= pararub )* )+
			{
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:277:3: (pararub1= pararub ( CONJ pararub2= pararub )* )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==VAR) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:277:4: pararub1= pararub ( CONJ pararub2= pararub )*
					{
					pushFollow(FOLLOW_pararub_in_pararubs881);
					pararub1=pararub();
					state._fsp--;


									pararub1_arbre = pararub1;
									les_pararubs_arbre.ajouteFils(pararub1_arbre);
								
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:283:3: ( CONJ pararub2= pararub )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==CONJ) ) {
							int LA12_1 = input.LA(2);
							if ( (LA12_1==VAR) ) {
								alt12=1;
							}

						}

						switch (alt12) {
						case 1 :
							// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:283:4: CONJ pararub2= pararub
							{
							match(input,CONJ,FOLLOW_CONJ_in_pararubs895); 
							pushFollow(FOLLOW_pararub_in_pararubs901);
							pararub2=pararub();
							state._fsp--;


											pararub2_arbre = pararub2;
											les_pararubs_arbre.ajouteFils(new Arbre("", "OR"));
											les_pararubs_arbre.ajouteFils(pararub2_arbre);
										
							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pararubs_arbre;
	}
	// $ANTLR end "pararubs"



	// $ANTLR start "pararub"
	// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:293:1: pararub returns [Arbre lepararub_arbre = new Arbre(\"\")] : a= VAR (b= VAR )? (c= VAR )? ;
	public final Arbre pararub() throws RecognitionException {
		Arbre lepararub_arbre =  new Arbre("");


		Token a=null;
		Token b=null;
		Token c=null;

		try {
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:293:57: (a= VAR (b= VAR )? (c= VAR )? )
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:294:2: a= VAR (b= VAR )? (c= VAR )?
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_pararub936); 
			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:294:10: (b= VAR )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==VAR) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:294:11: b= VAR
					{
					b=(Token)match(input,VAR,FOLLOW_VAR_in_pararub941); 
					}
					break;

			}

			// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:294:19: (c= VAR )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==VAR) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// E:\\France\\LO17\\LO17_TD\\LO17_TD3\\TD3_Antl\\tal_sql.g:294:20: c= VAR
					{
					c=(Token)match(input,VAR,FOLLOW_VAR_in_pararub948); 
					}
					break;

			}

			 
						if(b!=null){
							if(c!=null){
								lepararub_arbre.ajouteFils(new Arbre("r.rubrique =", "'"+a.getText()+" "+b.getText()+" "+c.getText()+"'"));
							}else{
								lepararub_arbre.ajouteFils(new Arbre("r.rubrique =", "'"+a.getText()+" "+b.getText()+"'"));
							}
						}else{
							lepararub_arbre.ajouteFils(new Arbre("r.rubrique =", "'"+a.getText()+"'"));
						}
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepararub_arbre;
	}
	// $ANTLR end "pararub"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes281 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_POINT_in_listerequetes284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete313 = new BitSet(new long[]{0x0000000000008260L});
	public static final BitSet FOLLOW_ARTICLE_in_requete325 = new BitSet(new long[]{0x000000000000AA00L});
	public static final BitSet FOLLOW_BULLETIN_in_requete337 = new BitSet(new long[]{0x000000000000AA00L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete349 = new BitSet(new long[]{0x000000000000AA00L});
	public static final BitSet FOLLOW_DATE_in_requete361 = new BitSet(new long[]{0x000000000000AA00L});
	public static final BitSet FOLLOW_condition_in_requete385 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_CONJ_in_requete395 = new BitSet(new long[]{0x000000000000AA00L});
	public static final BitSet FOLLOW_condition_in_requete401 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_MOT_in_condition440 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_params_in_condition453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_condition465 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_pararubs_in_condition478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_condition490 = new BitSet(new long[]{0x0000000000020410L});
	public static final BitSet FOLLOW_paradates_in_condition503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_condition515 = new BitSet(new long[]{0x0000000000021000L});
	public static final BitSet FOLLOW_paranums_in_condition528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params560 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_CONJ_in_params571 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_param_in_params577 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_VAR_in_param605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paranum_in_paranums635 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_CONJ_in_paranums647 = new BitSet(new long[]{0x0000000000021000L});
	public static final BitSet FOLLOW_paranum_in_paranums653 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_SIGN_in_paranum680 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_NUM_in_paranum688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paradate_in_paradates718 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_CONJ_in_paradates728 = new BitSet(new long[]{0x0000000000020410L});
	public static final BitSet FOLLOW_paradate_in_paradates734 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_parajour_in_paradate769 = new BitSet(new long[]{0x0000000000020010L});
	public static final BitSet FOLLOW_paraannee_in_paradate787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_parajour810 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_JOUR_in_parajour818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIGN_in_paraannee842 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_paraannee850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pararub_in_pararubs881 = new BitSet(new long[]{0x0000000000040102L});
	public static final BitSet FOLLOW_CONJ_in_pararubs895 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_pararub_in_pararubs901 = new BitSet(new long[]{0x0000000000040102L});
	public static final BitSet FOLLOW_VAR_in_pararub936 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_VAR_in_pararub941 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_VAR_in_pararub948 = new BitSet(new long[]{0x0000000000000002L});
}
