/* The following code was generated by JFlex 1.4.1 on 5/15/24, 9:44 PM */

package dev.romainguy.kotlin.explorer.code;

import java.io.*;
import javax.swing.text.Segment;

import org.fife.ui.rsyntaxtextarea.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 5/15/24, 9:44 PM from the specification file
 * <tt>/Users/romainguy/Source/kotlin-explorer/token-markers/src/main/java/dev/romainguy/kotlin/explorer/code/OatTokenMarker.flex</tt>
 */
public class OatTokenMarker extends AbstractJFlexTokenMaker {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int CODE = 2;
  public static final int FUNCTION_SIGNATURE = 6;
  public static final int YYINITIAL = 0;
  public static final int CLASS = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  1,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\21\1\20\1\0\1\21\23\0\1\21\1\0\1\13\1\11"+
    "\1\35\1\12\1\0\1\14\1\36\1\37\3\12\1\17\1\33\1\16"+
    "\1\6\1\62\1\62\1\63\1\5\1\5\1\5\1\5\1\5\1\5"+
    "\1\22\1\15\1\34\1\0\1\34\2\0\1\27\1\2\1\23\1\40"+
    "\1\74\1\56\1\102\1\66\1\60\2\1\1\25\1\100\1\52\1\64"+
    "\1\44\1\76\1\42\1\31\1\70\1\1\1\54\1\50\1\7\1\72"+
    "\1\46\1\12\1\0\1\12\1\0\1\1\1\0\1\30\1\4\1\24"+
    "\1\41\1\75\1\57\1\103\1\67\1\61\2\3\1\26\1\101\1\53"+
    "\1\65\1\45\1\77\1\43\1\32\1\71\1\3\1\55\1\51\1\10"+
    "\1\73\1\47\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\5\0\3\1\1\2\2\1\1\3\1\4\1\1\1\4"+
    "\1\5\2\6\1\1\1\5\1\7\1\10\1\11\1\7"+
    "\1\1\1\5\1\1\1\5\1\1\1\5\1\1\1\5"+
    "\1\1\1\5\1\1\1\5\1\1\1\5\1\1\1\5"+
    "\1\1\1\5\1\1\1\5\1\1\1\5\1\1\1\5"+
    "\1\1\1\5\1\1\1\5\1\1\1\5\5\1\1\12"+
    "\1\1\1\13\1\0\1\14\1\0\2\14\1\15\1\16"+
    "\2\17\1\14\1\0\1\5\1\0\1\5\2\0\2\5"+
    "\1\0\1\5\3\20\1\21\1\0\2\1\1\22\1\0"+
    "\1\5\1\0\1\5\2\0\2\5\1\1\1\23\1\1"+
    "\2\24\2\0\2\5\1\25";

  private static int [] zzUnpackAction() {
    int [] result = new int[108];
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
    "\0\0\0\104\0\210\0\314\0\u0110\0\u0154\0\u0198\0\u01dc"+
    "\0\u0220\0\u0264\0\u02a8\0\u0154\0\u02ec\0\u0330\0\u0374\0\u03b8"+
    "\0\u03fc\0\u0440\0\u0484\0\u04c8\0\u0154\0\u050c\0\u0550\0\u0264"+
    "\0\u0594\0\u05d8\0\u061c\0\u0660\0\u06a4\0\u06e8\0\u072c\0\u0770"+
    "\0\u07b4\0\u07f8\0\u083c\0\u0880\0\u08c4\0\u0908\0\u094c\0\u0990"+
    "\0\u09d4\0\u0a18\0\u0a5c\0\u0aa0\0\u0ae4\0\u0b28\0\u0b6c\0\u0bb0"+
    "\0\u0bf4\0\u0c38\0\u0c7c\0\u0cc0\0\u0d04\0\u0d48\0\u0d8c\0\u0dd0"+
    "\0\u0e14\0\u0e58\0\u0e9c\0\u0ee0\0\u0f24\0\u0f68\0\u0fac\0\u0154"+
    "\0\u094c\0\u0ff0\0\u1034\0\u0154\0\u0154\0\u0154\0\u03b8\0\u03b8"+
    "\0\u1078\0\u10bc\0\u1100\0\u1144\0\u1188\0\u11cc\0\u1210\0\u1254"+
    "\0\u1298\0\u12dc\0\u0d8c\0\u0dd0\0\u1320\0\u0e14\0\u1364\0\u13a8"+
    "\0\u13ec\0\u0fac\0\u1430\0\u1474\0\u14b8\0\u14fc\0\u1540\0\u1584"+
    "\0\u15c8\0\u160c\0\u1364\0\u0198\0\u1650\0\u0154\0\u03b8\0\u1694"+
    "\0\u16d8\0\u171c\0\u1760\0\u0198";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[108];
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
    "\1\6\5\7\1\10\2\7\4\6\1\11\1\12\1\13"+
    "\1\14\1\15\1\6\2\16\6\7\5\6\44\7\1\6"+
    "\5\7\1\10\2\7\4\6\1\11\1\12\1\13\1\14"+
    "\1\17\1\6\2\16\6\7\5\6\44\7\3\6\2\20"+
    "\1\21\1\22\1\23\1\24\2\25\1\26\1\27\1\11"+
    "\1\30\3\25\1\6\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\25\2\6\2\25\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\23\1\24"+
    "\1\51\1\52\1\31\1\32\1\53\1\54\1\55\1\56"+
    "\2\21\1\55\1\56\1\57\1\60\1\6\1\20\1\6"+
    "\1\20\1\61\1\62\1\6\1\20\1\63\1\64\1\65"+
    "\1\66\1\6\10\67\4\6\1\11\1\12\1\6\1\14"+
    "\1\15\1\6\10\67\5\6\44\67\1\6\4\70\2\7"+
    "\2\70\4\6\1\11\1\12\1\71\1\14\1\15\1\6"+
    "\10\70\3\6\1\72\1\6\22\70\2\7\20\70\104\0"+
    "\12\7\1\0\3\7\4\0\11\7\1\0\57\7\2\73"+
    "\1\7\1\0\3\7\4\0\11\7\1\0\50\7\20\11"+
    "\1\0\63\11\16\0\1\11\104\0\1\74\105\0\1\15"+
    "\62\0\12\7\1\0\3\7\4\0\3\7\2\75\4\7"+
    "\1\0\50\7\1\0\4\76\2\0\2\76\10\0\1\17"+
    "\1\0\10\76\5\0\22\76\2\0\20\76\3\0\2\20"+
    "\3\0\1\20\13\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\6\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\3\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\5\0\2\21\53\0\2\21"+
    "\25\0\2\21\2\77\51\0\2\21\25\0\2\100\37\0"+
    "\2\101\12\0\1\102\1\103\23\0\2\20\2\100\1\0"+
    "\1\20\13\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\6\0\1\20\1\0\1\20\1\0\1\20\1\101"+
    "\1\50\1\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\102\1\103\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\0\1\20\13\26\1\104\70\26"+
    "\14\27\1\105\67\27\23\0\2\106\4\0\2\106\54\0"+
    "\2\20\3\0\1\20\12\0\1\106\1\107\1\0\1\20"+
    "\1\0\1\20\1\106\1\107\6\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\3\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\31\0\2\106"+
    "\5\0\2\106\2\100\20\0\2\106\2\0\2\106\2\0"+
    "\2\106\11\0\2\20\3\0\1\20\13\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\106\1\107\5\0\1\106\1\107"+
    "\1\100\1\110\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\2\0\1\106\1\107\1\0\1\20\1\106\1\107\1\0"+
    "\1\20\1\106\1\107\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\25\0\2\106\11\0\2\111\45\0\2\20\3\0"+
    "\1\20\13\0\1\20\1\106\1\107\1\0\1\20\1\0"+
    "\1\20\5\0\1\111\1\112\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\3\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\44\0\2\100\22\0\4\106"+
    "\13\0\2\20\3\0\1\20\13\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\6\0\1\20\1\0\1\20"+
    "\1\100\1\110\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\3\0\1\20"+
    "\1\0\1\20\1\106\1\107\1\106\1\107\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\27\0\2\113"+
    "\56\0\2\20\3\0\1\20\13\0\1\20\1\0\1\20"+
    "\1\113\1\114\1\0\1\20\6\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\3\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\5\0\1\100"+
    "\54\0\1\102\1\103\23\0\2\20\1\100\2\0\1\20"+
    "\13\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\6\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\102\1\103\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\23\0\2\100\2\106\60\0"+
    "\2\20\3\0\1\20\12\0\1\100\1\110\1\106\1\107"+
    "\1\0\1\20\1\0\1\20\6\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\3\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\42\0\2\100"+
    "\43\0\2\20\3\0\1\20\13\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\6\0\1\20\1\100\1\110"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\3\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\31\0\2\115"+
    "\13\0\2\116\24\0\2\106\11\0\2\20\3\0\1\20"+
    "\13\0\1\20\1\0\1\20\1\0\1\20\1\115\1\117"+
    "\6\0\1\20\1\0\1\20\1\0\1\20\1\116\1\120"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\3\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\106\1\107\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\44\0\2\121\41\0\2\20\3\0\1\20"+
    "\13\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\6\0\1\20\1\0\1\20\1\121\1\122\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\3\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\31\0\2\115\54\0\2\20\3\0\1\20"+
    "\13\0\1\20\1\0\1\20\1\0\1\20\1\115\1\117"+
    "\6\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\3\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\31\0\2\106\25\0\2\106\25\0\2\20"+
    "\3\0\1\20\13\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\106\1\107\6\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\106\1\107\3\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\76\0\2\106\7\0\2\20"+
    "\3\0\1\20\13\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\6\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\3\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\106\1\107"+
    "\1\0\1\20\1\0\1\20\60\0\2\106\25\0\2\20"+
    "\3\0\1\20\13\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\6\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\106\1\107\3\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\70\0\2\106\2\0\2\106"+
    "\11\0\2\20\3\0\1\20\13\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\6\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\3\0\1\20"+
    "\1\0\1\20\1\106\1\107\1\0\1\20\1\106\1\107"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\12\123\1\0"+
    "\3\123\4\0\11\123\1\0\50\123\1\7\10\124\1\7"+
    "\1\0\3\7\4\0\1\7\10\124\1\125\2\124\2\7"+
    "\44\124\1\0\10\126\12\0\11\126\1\0\1\126\2\0"+
    "\44\126\20\127\1\0\63\127\2\7\1\130\1\7\3\130"+
    "\3\7\1\0\3\7\4\0\1\7\2\130\2\7\2\130"+
    "\2\7\1\0\4\7\2\130\14\7\2\130\2\7\2\130"+
    "\10\7\2\130\6\7\20\74\1\0\63\74\12\7\1\0"+
    "\3\7\4\0\5\7\2\131\2\7\1\0\50\7\1\0"+
    "\10\76\12\0\11\76\4\0\44\76\2\0\1\132\1\0"+
    "\3\132\14\0\2\132\2\0\2\132\7\0\2\132\14\0"+
    "\2\132\2\0\2\132\10\0\2\132\13\0\2\100\53\0"+
    "\2\100\26\0\1\100\135\0\2\133\45\0\2\20\3\0"+
    "\1\20\13\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\5\0\1\133\1\134\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\3\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\60\0\2\135\25\0\2\20"+
    "\3\0\1\20\13\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\6\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\135\1\136\3\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\66\0\2\137\37\0\2\140"+
    "\62\0\2\20\3\0\1\20\13\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\6\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\3\0\1\20"+
    "\1\137\1\141\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\3\0\2\20"+
    "\3\0\1\20\12\0\1\140\1\142\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\6\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\0\1\20\3\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\0\1\20\23\0\2\101\4\0"+
    "\2\101\54\0\2\20\3\0\1\20\12\0\1\101\1\50"+
    "\1\0\1\20\1\0\1\20\1\101\1\50\6\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\3\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\10\125\12\0\13\125\2\0\44\125\20\127\1\0"+
    "\16\127\1\143\44\127\2\7\1\130\1\7\3\130\3\7"+
    "\1\0\3\7\4\0\1\144\2\130\2\7\2\130\2\7"+
    "\1\0\4\7\2\130\14\7\2\130\2\7\2\130\10\7"+
    "\2\130\20\7\1\0\3\7\4\0\7\7\2\145\1\0"+
    "\50\7\42\0\2\146\43\0\2\20\3\0\1\20\13\0"+
    "\1\20\1\0\1\20\1\0\1\20\1\0\1\20\6\0"+
    "\1\20\1\146\1\147\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\3\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\56\0\2\100\27\0\2\20\3\0\1\20\13\0"+
    "\1\20\1\0\1\20\1\0\1\20\1\0\1\20\6\0"+
    "\1\20\1\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\0\1\20\1\100\1\110\1\0"+
    "\1\20\3\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\25\0\2\150\2\0\2\151\125\0\2\100\31\0"+
    "\2\20\3\0\1\20\13\0\1\20\1\150\1\152\1\0"+
    "\1\20\1\151\1\153\6\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\0\1\20\3\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\0\1\20\3\0\2\20\3\0"+
    "\1\20\13\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\6\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\0\1\20\1\100\1\110\1\0"+
    "\1\20\1\0\1\20\3\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\12\7\1\0\3\7\4\0\7\7"+
    "\2\154\1\0\50\7\40\0\2\106\132\0\2\106\15\0"+
    "\2\20\3\0\1\20\13\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\5\0\1\106\1\107\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\3\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\3\0\2\20"+
    "\3\0\1\20\13\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\6\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20\3\0\1\20\1\0\1\20"+
    "\1\106\1\107\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\1\20";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6052];
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
    "\5\0\1\11\5\1\1\11\10\1\1\11\51\1\1\0"+
    "\1\11\1\0\2\1\3\11\2\1\1\0\1\1\1\0"+
    "\1\1\2\0\2\1\1\0\5\1\1\0\3\1\1\0"+
    "\1\1\1\0\1\1\2\0\5\1\1\11\1\1\2\0"+
    "\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[108];
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
  private char zzBuffer[];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

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

  /* user code: */
    public OatTokenMarker() {
        super();
    }

    private void addToken(int tokenType) {
        addToken(zzStartRead, zzMarkedPos-1, tokenType);
    }

    private void addToken(int start, int end, int tokenType) {
        int so = start + offsetShift;
        addToken(zzBuffer, start,end, tokenType, so);
    }

    @Override
    public void addToken(char[] array, int start, int end, int tokenType, int startOffset) {
        super.addToken(array, start,end, tokenType, startOffset);
        zzStartRead = zzMarkedPos;
    }

    @Override
    public String[] getLineCommentStartAndEnd(int languageIndex) {
        return new String[] { ";", null };
    }

    public Token getTokenList(Segment text, int initialTokenType, int startOffset) {

        resetTokenList();
        this.offsetShift = -text.offset + startOffset;

        // Start off in the proper state.
        int state = Token.NULL;

        s = text;
        try {
            yyreset(zzReader);
            yybegin(state);
            return yylex();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return new TokenImpl();
        }

    }

    private boolean zzRefill() {
        return zzCurrentPos>=s.offset+s.count;
    }

    public final void yyreset(Reader reader) {
        // 's' has been updated.
        zzBuffer = s.array;
        /*
         * We replaced the line below with the two below it because zzRefill
         * no longer "refills" the buffer (since the way we do it, it's always
         * "full" the first time through, since it points to the segment's
         * array).  So, we assign zzEndRead here.
         */
        //zzStartRead = zzEndRead = s.offset;
        zzStartRead = s.offset;
        zzEndRead = zzStartRead + s.count - 1;
        zzCurrentPos = zzMarkedPos = zzPushbackPos = s.offset;
        zzLexicalState = YYINITIAL;
        zzReader = reader;
        zzAtBOL  = true;
        zzAtEOF  = false;
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public OatTokenMarker(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public OatTokenMarker(java.io.InputStream in) {
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
    while (i < 186) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public org.fife.ui.rsyntaxtextarea.Token yylex() throws java.io.IOException {
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

      if (zzMarkedPosL > zzStartRead) {
        switch (zzBufferL[zzMarkedPosL-1]) {
        case '\n':
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          zzAtBOL = true;
          break;
        case '\r': 
          if (zzMarkedPosL < zzEndReadL)
            zzAtBOL = zzBufferL[zzMarkedPosL] != '\n';
          else if (zzAtEOF)
            zzAtBOL = false;
          else {
            boolean eof = zzRefill();
            zzMarkedPosL = zzMarkedPos;
            zzEndReadL = zzEndRead;
            zzBufferL = zzBuffer;
            if (eof) 
              zzAtBOL = false;
            else 
              zzAtBOL = zzBufferL[zzMarkedPosL] != '\n';
          }
          break;
        default:
          zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
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
        case 3: 
          { addNullToken(); return firstToken;
          }
        case 22: break;
        case 14: 
          { addToken(Token.LITERAL_CHAR);
          }
        case 23: break;
        case 17: 
          { addToken(Token.COMMENT_MULTILINE);
          }
        case 24: break;
        case 4: 
          { addToken(Token.WHITESPACE);
          }
        case 25: break;
        case 18: 
          { addToken(Token.LITERAL_NUMBER_HEXADECIMAL);
          }
        case 26: break;
        case 10: 
          { addToken(Token.MARKUP_CDATA); addNullToken(); return firstToken;
          }
        case 27: break;
        case 11: 
          { addToken(Token.DATA_TYPE);
        yybegin(FUNCTION_SIGNATURE);
          }
        case 28: break;
        case 5: 
          { addToken(Token.RESERVED_WORD);
          }
        case 29: break;
        case 12: 
          { addToken(Token.VARIABLE);
          }
        case 30: break;
        case 1: 
          { addToken(Token.IDENTIFIER);
          }
        case 31: break;
        case 16: 
          { addToken(Token.FUNCTION);
          }
        case 32: break;
        case 8: 
          { addToken(Token.ERROR_STRING_DOUBLE); addNullToken(); return firstToken;
          }
        case 33: break;
        case 20: 
          { addToken(Token.DATA_TYPE);
          }
        case 34: break;
        case 9: 
          { addToken(Token.ERROR_CHAR);
          }
        case 35: break;
        case 21: 
          { addToken(Token.RESERVED_WORD); yybegin(CLASS);
          }
        case 36: break;
        case 13: 
          { addToken(Token.LITERAL_STRING_DOUBLE_QUOTE);
          }
        case 37: break;
        case 2: 
          { addToken(Token.COMMENT_EOL); addNullToken(); return firstToken;
          }
        case 38: break;
        case 15: 
          { addToken(Token.RESERVED_WORD_2);
          }
        case 39: break;
        case 19: 
          { addToken(Token.PREPROCESSOR); yybegin(CODE);
          }
        case 40: break;
        case 6: 
          { addToken(Token.LITERAL_NUMBER_DECIMAL_INT);
          }
        case 41: break;
        case 7: 
          { addToken(Token.OPERATOR);
          }
        case 42: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
            case CODE: {
              addNullToken(); return firstToken;
            }
            case 109: break;
            case FUNCTION_SIGNATURE: {
              addNullToken(); return firstToken;
            }
            case 110: break;
            case YYINITIAL: {
              addNullToken(); return firstToken;
            }
            case 111: break;
            case CLASS: {
              addNullToken(); return firstToken;
            }
            case 112: break;
            default:
            return null;
            }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
