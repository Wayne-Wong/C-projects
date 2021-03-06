/* The following code was generated by JFlex 1.4.3 on 2/8/17 9:53 PM */

// Name: Wayne Wong
// Date: 2/8/2017
// Program: Lexical Analyzer
// (This program is a continuation of the code provided by Dr. Bryant)

import java_cup . runtime . *;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 2/8/17 9:53 PM from the specification file
 * <tt>tinyCPP.jflex</tt>
 */
class tinyCPP_Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\6\1\5\25\0\1\6\1\24\1\0\1\12\1\0\1\30"+
    "\1\32\1\0\1\17\1\20\1\27\1\25\1\11\1\26\1\10\1\4"+
    "\12\3\1\31\1\7\1\21\1\23\1\22\2\0\13\1\1\62\1\1"+
    "\1\60\6\1\1\61\5\1\1\15\1\0\1\16\1\0\1\2\1\0"+
    "\1\42\1\34\1\41\1\47\1\35\1\50\1\36\1\54\1\37\2\1"+
    "\1\43\1\57\1\40\1\44\1\51\1\1\1\52\1\45\1\46\1\53"+
    "\1\55\1\56\3\1\1\13\1\33\1\14\54\0\1\1\12\0\1\1"+
    "\4\0\1\1\5\0\27\1\1\0\37\1\1\0\u01ca\1\4\0\14\1"+
    "\16\0\5\1\7\0\1\1\1\0\1\1\201\0\5\1\1\0\2\1"+
    "\2\0\4\1\10\0\1\1\1\0\3\1\1\0\1\1\1\0\24\1"+
    "\1\0\123\1\1\0\213\1\10\0\236\1\11\0\46\1\2\0\1\1"+
    "\7\0\47\1\110\0\33\1\5\0\3\1\55\0\53\1\25\0\12\3"+
    "\4\0\2\1\1\0\143\1\1\0\1\1\17\0\2\1\7\0\2\1"+
    "\12\3\3\1\2\0\1\1\20\0\1\1\1\0\36\1\35\0\131\1"+
    "\13\0\1\1\16\0\12\3\41\1\11\0\2\1\4\0\1\1\5\0"+
    "\26\1\4\0\1\1\11\0\1\1\3\0\1\1\27\0\31\1\107\0"+
    "\1\1\1\0\13\1\127\0\66\1\3\0\1\1\22\0\1\1\7\0"+
    "\12\1\4\0\12\3\1\0\7\1\1\0\7\1\5\0\10\1\2\0"+
    "\2\1\2\0\26\1\1\0\7\1\1\0\1\1\3\0\4\1\3\0"+
    "\1\1\20\0\1\1\15\0\2\1\1\0\3\1\4\0\12\3\2\1"+
    "\23\0\6\1\4\0\2\1\2\0\26\1\1\0\7\1\1\0\2\1"+
    "\1\0\2\1\1\0\2\1\37\0\4\1\1\0\1\1\7\0\12\3"+
    "\2\0\3\1\20\0\11\1\1\0\3\1\1\0\26\1\1\0\7\1"+
    "\1\0\2\1\1\0\5\1\3\0\1\1\22\0\1\1\17\0\2\1"+
    "\4\0\12\3\25\0\10\1\2\0\2\1\2\0\26\1\1\0\7\1"+
    "\1\0\2\1\1\0\5\1\3\0\1\1\36\0\2\1\1\0\3\1"+
    "\4\0\12\3\1\0\1\1\21\0\1\1\1\0\6\1\3\0\3\1"+
    "\1\0\4\1\3\0\2\1\1\0\1\1\1\0\2\1\3\0\2\1"+
    "\3\0\3\1\3\0\14\1\26\0\1\1\25\0\12\3\25\0\10\1"+
    "\1\0\3\1\1\0\27\1\1\0\12\1\1\0\5\1\3\0\1\1"+
    "\32\0\2\1\6\0\2\1\4\0\12\3\25\0\10\1\1\0\3\1"+
    "\1\0\27\1\1\0\12\1\1\0\5\1\3\0\1\1\40\0\1\1"+
    "\1\0\2\1\4\0\12\3\1\0\2\1\22\0\10\1\1\0\3\1"+
    "\1\0\51\1\2\0\1\1\20\0\1\1\21\0\2\1\4\0\12\3"+
    "\12\0\6\1\5\0\22\1\3\0\30\1\1\0\11\1\1\0\1\1"+
    "\2\0\7\1\72\0\60\1\1\0\2\1\14\0\7\1\11\0\12\3"+
    "\47\0\2\1\1\0\1\1\2\0\2\1\1\0\1\1\2\0\1\1"+
    "\6\0\4\1\1\0\7\1\1\0\3\1\1\0\1\1\1\0\1\1"+
    "\2\0\2\1\1\0\4\1\1\0\2\1\11\0\1\1\2\0\5\1"+
    "\1\0\1\1\11\0\12\3\2\0\4\1\40\0\1\1\37\0\12\3"+
    "\26\0\10\1\1\0\44\1\33\0\5\1\163\0\53\1\24\0\1\1"+
    "\12\3\6\0\6\1\4\0\4\1\3\0\1\1\3\0\2\1\7\0"+
    "\3\1\4\0\15\1\14\0\1\1\1\0\12\3\6\0\46\1\1\0"+
    "\1\1\5\0\1\1\2\0\53\1\1\0\u014d\1\1\0\4\1\2\0"+
    "\7\1\1\0\1\1\1\0\4\1\2\0\51\1\1\0\4\1\2\0"+
    "\41\1\1\0\4\1\2\0\7\1\1\0\1\1\1\0\4\1\2\0"+
    "\17\1\1\0\71\1\1\0\4\1\2\0\103\1\45\0\20\1\20\0"+
    "\125\1\14\0\u026c\1\2\0\21\1\1\0\32\1\5\0\113\1\25\0"+
    "\15\1\1\0\4\1\16\0\22\1\16\0\22\1\16\0\15\1\1\0"+
    "\3\1\17\0\64\1\43\0\1\1\4\0\1\1\3\0\12\3\46\0"+
    "\12\3\6\0\130\1\10\0\51\1\1\0\1\1\5\0\106\1\12\0"+
    "\35\1\51\0\12\3\36\1\2\0\5\1\13\0\54\1\25\0\7\1"+
    "\10\0\12\3\46\0\27\1\11\0\65\1\53\0\12\3\6\0\12\3"+
    "\15\0\1\1\135\0\57\1\21\0\7\1\4\0\12\3\51\0\36\1"+
    "\15\0\2\1\12\3\54\1\32\0\44\1\34\0\12\3\3\0\3\1"+
    "\12\3\44\1\153\0\4\1\1\0\4\1\3\0\2\1\11\0\300\1"+
    "\100\0\u0116\1\2\0\6\1\2\0\46\1\2\0\6\1\2\0\10\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\0\37\1\2\0\65\1"+
    "\1\0\7\1\1\0\1\1\3\0\3\1\1\0\7\1\3\0\4\1"+
    "\2\0\6\1\4\0\15\1\5\0\3\1\1\0\7\1\164\0\1\1"+
    "\15\0\1\1\20\0\15\1\145\0\1\1\4\0\1\1\2\0\12\1"+
    "\1\0\1\1\3\0\5\1\6\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\4\1\1\0\13\1\2\0\4\1\5\0\5\1\4\0\1\1"+
    "\64\0\2\1\u0a7b\0\57\1\1\0\57\1\1\0\205\1\6\0\4\1"+
    "\3\0\2\1\14\0\46\1\1\0\1\1\5\0\1\1\2\0\70\1"+
    "\7\0\1\1\20\0\27\1\11\0\7\1\1\0\7\1\1\0\7\1"+
    "\1\0\7\1\1\0\7\1\1\0\7\1\1\0\7\1\1\0\7\1"+
    "\120\0\1\1\u01d5\0\2\1\52\0\5\1\5\0\2\1\4\0\126\1"+
    "\6\0\3\1\1\0\132\1\1\0\4\1\5\0\51\1\3\0\136\1"+
    "\21\0\33\1\65\0\20\1\u0200\0\u19b6\1\112\0\u51cd\1\63\0\u048d\1"+
    "\103\0\56\1\2\0\u010d\1\3\0\20\1\12\3\2\1\24\0\57\1"+
    "\20\0\31\1\10\0\106\1\61\0\11\1\2\0\147\1\2\0\4\1"+
    "\1\0\4\1\14\0\13\1\115\0\12\1\1\0\3\1\1\0\4\1"+
    "\1\0\27\1\35\0\64\1\16\0\62\1\34\0\12\3\30\0\6\1"+
    "\3\0\1\1\4\0\12\3\34\1\12\0\27\1\31\0\35\1\7\0"+
    "\57\1\34\0\1\1\12\3\46\0\51\1\27\0\3\1\1\0\10\1"+
    "\4\0\12\3\6\0\27\1\3\0\1\1\5\0\60\1\1\0\1\1"+
    "\3\0\2\1\2\0\5\1\2\0\1\1\1\0\1\1\30\0\3\1"+
    "\2\0\13\1\7\0\3\1\14\0\6\1\2\0\6\1\2\0\6\1"+
    "\11\0\7\1\1\0\7\1\221\0\43\1\15\0\12\3\6\0\u2ba4\1"+
    "\14\0\27\1\4\0\61\1\u2104\0\u016e\1\2\0\152\1\46\0\7\1"+
    "\14\0\5\1\5\0\1\1\1\0\12\1\1\0\15\1\1\0\5\1"+
    "\1\0\1\1\1\0\2\1\1\0\2\1\1\0\154\1\41\0\u016b\1"+
    "\22\0\100\1\2\0\66\1\50\0\14\1\164\0\5\1\1\0\207\1"+
    "\23\0\12\3\7\0\32\1\6\0\32\1\13\0\131\1\3\0\6\1"+
    "\2\0\6\1\2\0\6\1\2\0\3\1\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\1\1\2\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\2\1\23\1\24\1\25"+
    "\1\26\1\27\2\2\20\1\1\0\1\5\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\5\1\1\43\10\1\1\44\11\1\1\45\2\1"+
    "\1\46\2\1\1\47\4\1\1\50\1\51\7\1\1\52"+
    "\4\1\1\53\3\1\1\54\2\1\1\55\1\1\1\56"+
    "\6\1\1\57\1\60\1\61\3\1\1\62\1\63\5\1"+
    "\1\64\1\65\3\1\1\66\2\1\1\67\1\70\1\71"+
    "\2\1\1\72\1\1\1\73\2\1\1\74\1\75";

  private static int [] zzUnpackAction() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\63\0\146\0\231\0\314\0\377\0\63\0\63"+
    "\0\63\0\63\0\63\0\63\0\63\0\63\0\63\0\63"+
    "\0\63\0\u0132\0\u0165\0\u0198\0\u01cb\0\u01fe\0\u0231\0\63"+
    "\0\63\0\u0264\0\u0297\0\u02ca\0\u02fd\0\u0330\0\u0363\0\u0396"+
    "\0\u03c9\0\u03fc\0\u042f\0\u0462\0\u0495\0\u04c8\0\u04fb\0\u052e"+
    "\0\u0561\0\u0594\0\u05c7\0\u05fa\0\231\0\u062d\0\63\0\63"+
    "\0\63\0\63\0\63\0\63\0\63\0\63\0\63\0\63"+
    "\0\63\0\u0660\0\u0693\0\u06c6\0\u06f9\0\u072c\0\146\0\u075f"+
    "\0\u0792\0\u07c5\0\u07f8\0\u082b\0\u085e\0\u0891\0\u08c4\0\146"+
    "\0\u08f7\0\u092a\0\u095d\0\u0990\0\u09c3\0\u09f6\0\u0a29\0\u0a5c"+
    "\0\u0a8f\0\146\0\u0ac2\0\u0af5\0\146\0\u0b28\0\u0b5b\0\146"+
    "\0\u0b8e\0\u0bc1\0\u0bf4\0\u0c27\0\146\0\146\0\u0c5a\0\u0c8d"+
    "\0\u0cc0\0\u0cf3\0\u0d26\0\u0d59\0\u0d8c\0\146\0\u0dbf\0\u0df2"+
    "\0\u0e25\0\u0e58\0\146\0\u0e8b\0\u0ebe\0\u0ef1\0\146\0\u0f24"+
    "\0\u0f57\0\146\0\u0f8a\0\146\0\u0fbd\0\u0ff0\0\u1023\0\u1056"+
    "\0\u1089\0\u10bc\0\146\0\146\0\146\0\u10ef\0\u1122\0\u1155"+
    "\0\146\0\146\0\u1188\0\u11bb\0\u11ee\0\u1221\0\u1254\0\146"+
    "\0\146\0\u1287\0\u12ba\0\u12ed\0\146\0\u1320\0\u1353\0\146"+
    "\0\146\0\146\0\u1386\0\u13b9\0\146\0\u13ec\0\146\0\u141f"+
    "\0\u1452\0\146\0\146";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\2\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\3\1\37\1\40"+
    "\1\41\2\3\1\42\1\43\1\44\1\45\1\3\1\46"+
    "\1\47\1\50\1\3\1\51\1\52\1\53\1\54\2\3"+
    "\64\0\1\3\1\55\31\0\27\3\1\0\1\3\1\0"+
    "\1\3\30\0\27\3\3\0\1\5\63\0\1\56\77\0"+
    "\1\57\1\0\1\60\61\0\1\61\1\62\62\0\1\63"+
    "\62\0\1\64\64\0\1\65\63\0\1\66\57\0\1\67"+
    "\71\0\1\70\63\0\1\71\30\0\1\3\1\55\31\0"+
    "\1\3\1\72\25\3\1\0\1\3\1\55\31\0\4\3"+
    "\1\73\2\3\1\74\17\3\1\0\1\3\1\55\31\0"+
    "\4\3\1\75\3\3\1\76\3\3\1\77\12\3\1\0"+
    "\1\3\1\55\31\0\6\3\1\100\20\3\1\0\1\3"+
    "\1\55\31\0\3\3\1\101\2\3\1\102\1\103\1\104"+
    "\16\3\1\0\1\3\1\55\31\0\13\3\1\105\13\3"+
    "\1\0\1\3\1\55\31\0\12\3\1\106\14\3\1\0"+
    "\1\3\1\55\31\0\20\3\1\107\6\3\1\0\1\3"+
    "\1\55\31\0\10\3\1\110\16\3\1\0\1\3\1\55"+
    "\31\0\16\3\1\111\1\112\7\3\1\0\1\3\1\55"+
    "\31\0\1\3\1\113\25\3\1\0\1\3\1\55\31\0"+
    "\11\3\1\114\15\3\1\0\1\3\1\55\31\0\6\3"+
    "\1\115\20\3\1\0\1\3\1\55\31\0\20\3\1\116"+
    "\6\3\1\0\1\3\1\55\31\0\6\3\1\117\20\3"+
    "\1\0\1\3\1\55\31\0\25\3\1\120\1\3\5\56"+
    "\1\0\55\56\1\0\1\3\1\55\31\0\2\3\1\121"+
    "\24\3\1\0\1\3\1\55\31\0\13\3\1\122\13\3"+
    "\1\0\1\3\1\55\31\0\11\3\1\123\15\3\1\0"+
    "\1\3\1\55\31\0\5\3\1\124\4\3\1\125\14\3"+
    "\1\0\1\3\1\55\31\0\11\3\1\126\15\3\1\0"+
    "\1\3\1\55\31\0\23\3\1\127\3\3\1\0\1\3"+
    "\1\55\31\0\4\3\1\130\22\3\1\0\1\3\1\55"+
    "\31\0\7\3\1\131\17\3\1\0\1\3\1\55\31\0"+
    "\6\3\1\132\20\3\1\0\1\3\1\55\31\0\4\3"+
    "\1\133\12\3\1\134\7\3\1\0\1\3\1\55\31\0"+
    "\13\3\1\135\13\3\1\0\1\3\1\55\31\0\13\3"+
    "\1\136\2\3\1\137\10\3\1\0\1\3\1\55\31\0"+
    "\1\3\1\140\25\3\1\0\1\3\1\55\31\0\3\3"+
    "\1\141\4\3\1\142\16\3\1\0\1\3\1\55\31\0"+
    "\1\143\26\3\1\0\1\3\1\55\31\0\12\3\1\144"+
    "\14\3\1\0\1\3\1\55\31\0\3\3\1\145\23\3"+
    "\1\0\1\3\1\55\31\0\16\3\1\146\10\3\1\0"+
    "\1\3\1\55\31\0\3\3\1\147\23\3\1\0\1\3"+
    "\1\55\31\0\3\3\1\150\23\3\1\0\1\3\1\55"+
    "\31\0\26\3\1\151\1\0\1\3\1\55\31\0\3\3"+
    "\1\152\23\3\1\0\1\3\1\55\31\0\1\3\1\153"+
    "\25\3\1\0\1\3\1\55\31\0\7\3\1\154\17\3"+
    "\1\0\1\3\1\55\31\0\12\3\1\155\14\3\1\0"+
    "\1\3\1\55\31\0\1\3\1\156\25\3\1\0\1\3"+
    "\1\55\31\0\7\3\1\157\17\3\1\0\1\3\1\55"+
    "\31\0\11\3\1\160\15\3\1\0\1\3\1\55\31\0"+
    "\11\3\1\161\15\3\1\0\1\3\1\55\31\0\12\3"+
    "\1\162\14\3\1\0\1\3\1\55\31\0\17\3\1\163"+
    "\7\3\1\0\1\3\1\55\31\0\4\3\1\164\22\3"+
    "\1\0\1\3\1\55\31\0\21\3\1\165\5\3\1\0"+
    "\1\3\1\55\31\0\5\3\1\166\21\3\1\0\1\3"+
    "\1\55\31\0\7\3\1\167\17\3\1\0\1\3\1\55"+
    "\31\0\17\3\1\170\7\3\1\0\1\3\1\55\31\0"+
    "\4\3\1\171\22\3\1\0\1\3\1\55\31\0\7\3"+
    "\1\172\17\3\1\0\1\3\1\55\31\0\4\3\1\173"+
    "\22\3\1\0\1\3\1\55\31\0\26\3\1\174\1\0"+
    "\1\3\1\55\31\0\4\3\1\175\22\3\1\0\1\3"+
    "\1\55\31\0\17\3\1\176\7\3\1\0\1\3\1\55"+
    "\31\0\16\3\1\177\10\3\1\0\1\3\1\55\31\0"+
    "\11\3\1\200\15\3\1\0\1\3\1\55\31\0\11\3"+
    "\1\201\15\3\1\0\1\3\1\55\31\0\12\3\1\202"+
    "\14\3\1\0\1\3\1\55\31\0\5\3\1\203\21\3"+
    "\1\0\1\3\1\55\31\0\6\3\1\204\20\3\1\0"+
    "\1\3\1\55\31\0\1\3\1\205\25\3\1\0\1\3"+
    "\1\55\31\0\3\3\1\206\23\3\1\0\1\3\1\55"+
    "\31\0\16\3\1\207\10\3\1\0\1\3\1\55\31\0"+
    "\2\3\1\210\24\3\1\0\1\3\1\55\31\0\1\3"+
    "\1\211\25\3\1\0\1\3\1\55\31\0\13\3\1\212"+
    "\13\3\1\0\1\3\1\55\31\0\1\3\1\213\25\3"+
    "\1\0\1\3\1\55\31\0\15\3\1\214\11\3\1\0"+
    "\1\3\1\55\31\0\12\3\1\215\14\3\1\0\1\3"+
    "\1\55\31\0\12\3\1\216\14\3\1\0\1\3\1\55"+
    "\31\0\13\3\1\217\13\3\1\0\1\3\1\55\31\0"+
    "\5\3\1\220\21\3\1\0\1\3\1\55\31\0\4\3"+
    "\1\221\22\3\1\0\1\3\1\55\31\0\1\3\1\222"+
    "\25\3\1\0\1\3\1\55\31\0\6\3\1\223\20\3"+
    "\1\0\1\3\1\55\31\0\6\3\1\224\20\3\1\0"+
    "\1\3\1\55\31\0\1\3\1\225\25\3\1\0\1\3"+
    "\1\55\31\0\17\3\1\226\7\3\1\0\1\3\1\55"+
    "\31\0\23\3\1\227\3\3\1\0\1\3\1\55\31\0"+
    "\5\3\1\230\21\3\1\0\1\3\1\55\31\0\16\3"+
    "\1\231\10\3\1\0\1\3\1\55\31\0\1\3\1\232"+
    "\25\3\1\0\1\3\1\55\31\0\1\3\1\233\25\3";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5253];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\4\1\13\11\6\1\2\11\23\1\1\0"+
    "\1\1\13\11\142\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private SymbolFactory symbolFactory;

  public tinyCPP_Lexer (java . io . InputStream input, SymbolFactory sf) {
    this (input);
    symbolFactory = sf;
  }

  private void echo () { System . out . print (yytext ()); }

  public int position () { return yycolumn; }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  tinyCPP_Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  tinyCPP_Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1714) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 44: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, end)", Symbol . CALL);
          }
        case 62: break;
        case 20: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, -)", Symbol . MINUS);
          }
        case 63: break;
        case 41: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, std)", Symbol . STD);
          }
        case 64: break;
        case 15: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(punctuation, ))", Symbol . RPAREN);
          }
        case 65: break;
        case 51: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, const)", Symbol . CONST);
          }
        case 66: break;
        case 56: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, return)", Symbol . RETURN);
          }
        case 67: break;
        case 18: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, =)", Symbol . EQ);
          }
        case 68: break;
        case 24: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, <<)", Symbol . LL);
          }
        case 69: break;
        case 21: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, *)", Symbol . TIMES);
          }
        case 70: break;
        case 12: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(punctuation, [)", Symbol . OPENB);
          }
        case 71: break;
        case 45: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, cout)", Symbol . COUT);
          }
        case 72: break;
        case 48: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, NULL)", Symbol . NIL);
          }
        case 73: break;
        case 40: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, odd)", Symbol . ODD);
          }
        case 74: break;
        case 16: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, <)", Symbol . LT);
          }
        case 75: break;
        case 47: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, main)", Symbol . MAIN);
          }
        case 76: break;
        case 61: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, procedure)", Symbol . PROC);
          }
        case 77: break;
        case 33: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, &&)", Symbol . AND);
          }
        case 78: break;
        case 8: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(punctuation, ,)", Symbol . COMMA);
          }
        case 79: break;
        case 10: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(punctuation, {)", Symbol . LEFTB);
          }
        case 80: break;
        case 55: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, public)", Symbol . PUBLIC);
          }
        case 81: break;
        case 43: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, else)", Symbol . ELSE);
          }
        case 82: break;
        case 57: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, include)", Symbol . INCLUDE);
          }
        case 83: break;
        case 25: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, <=)", Symbol . LE);
          }
        case 84: break;
        case 22: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, %)", Symbol . MODULO);
          }
        case 85: break;
        case 2: 
          { echo (); ErrorMessage . print (yychar, "Illegal character");
          }
        case 86: break;
        case 37: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, end)", Symbol . END);
          }
        case 87: break;
        case 60: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, namespace)", Symbol . NAMESPACE);
          }
        case 88: break;
        case 6: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(punctuation, ;)", Symbol . SEMICOLON);
          }
        case 89: break;
        case 27: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, >=)", Symbol . GE);
          }
        case 90: break;
        case 14: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(punctuation, ()", Symbol . LPAREN);
          }
        case 91: break;
        case 49: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, begin)", Symbol . BEGIN);
          }
        case 92: break;
        case 46: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, then)", Symbol . THEN);
          }
        case 93: break;
        case 58: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, private)", Symbol . PRIVATE);
          }
        case 94: break;
        case 13: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(punctuation, ])", Symbol . CLOSEB);
          }
        case 95: break;
        case 29: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, !=)", Symbol . NE);
          }
        case 96: break;
        case 28: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, ==)", Symbol . EQQ);
          }
        case 97: break;
        case 54: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, struct)", Symbol . STRUCT);
          }
        case 98: break;
        case 34: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, ||)", Symbol . OR);
          }
        case 99: break;
        case 42: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, var)", Symbol . VAR);
          }
        case 100: break;
        case 32: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, :=)", Symbol . ASSIGN);
          }
        case 101: break;
        case 7: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(punctuation, .)", Symbol . PERIOD);
          }
        case 102: break;
        case 36: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, do)", Symbol . DO);
          }
        case 103: break;
        case 4: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, /)", Symbol . SLASH);
          }
        case 104: break;
        case 3: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(integer, " + yytext () + ")", 
                      Symbol . INTEGER, yytext ());
          }
        case 105: break;
        case 35: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, if)", Symbol . IF);
          }
        case 106: break;
        case 53: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, while)", Symbol . WHILE);
          }
        case 107: break;
        case 50: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, class)", Symbol . CLASS);
          }
        case 108: break;
        case 59: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, iostream)", Symbol . IOSTREAM);
          }
        case 109: break;
        case 11: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(punctuation, })", Symbol . RIGHTB);
          }
        case 110: break;
        case 38: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, int)", Symbol . INT);
          }
        case 111: break;
        case 9: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(punctuation, #)", Symbol . HASH);
          }
        case 112: break;
        case 31: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, --)", Symbol . MINUSS);
          }
        case 113: break;
        case 1: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(identifier, " + yytext () + ")", 
                      Symbol . ID, yytext ());
          }
        case 114: break;
        case 23: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, :)", Symbol . COLON);
          }
        case 115: break;
        case 26: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, >>)", Symbol . RR);
          }
        case 116: break;
        case 19: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, +)", Symbol . PLUS);
          }
        case 117: break;
        case 39: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, cin)", Symbol . CIN);
          }
        case 118: break;
        case 5: 
          { echo ();
          }
        case 119: break;
        case 17: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, >)", Symbol . GT);
          }
        case 120: break;
        case 52: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(keyword, using)", Symbol . USING);
          }
        case 121: break;
        case 30: 
          { echo (); 
                  return symbolFactory . 
                    newSymbol ("(operator, ++)", Symbol . PLUSS);
          }
        case 122: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {   return symbolFactory . newSymbol ("EOF", Symbol . EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
