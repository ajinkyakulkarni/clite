/* The following code was generated by JFlex 1.4.3 on 08.12.09 14:34 */

package lexyaccgen;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 08.12.09 14:34 from the specification file
 * <tt>C:/Users/Muxxxa/workspace/CI/Clite/src/scan.flex</tt>
 */
public class MyScanner1 {

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
    "\11\0\1\1\1\5\1\0\1\1\1\4\22\0\1\1\1\14\1\11"+
    "\5\0\1\55\1\56\1\3\1\12\1\62\1\12\1\61\1\2\1\6"+
    "\11\7\1\0\1\63\1\15\1\13\1\15\2\0\1\43\1\45\1\10"+
    "\1\51\1\46\1\10\1\42\1\10\1\47\3\10\1\44\1\50\1\41"+
    "\1\37\1\10\1\40\10\10\1\57\1\0\1\60\1\0\1\52\1\0"+
    "\1\31\1\45\1\30\1\25\1\20\1\17\1\36\1\27\1\16\2\10"+
    "\1\21\1\44\1\32\1\23\1\33\1\10\1\24\1\22\1\34\1\35"+
    "\1\10\1\26\3\10\1\53\1\0\1\54\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\1\2\3\2\4\1\5\1\2\1\6"+
    "\1\2\1\7\14\5\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\1\2\0\1\21\1\7"+
    "\1\22\15\5\1\0\1\23\1\5\1\24\11\5\1\1"+
    "\11\5\1\25\1\5\1\26\1\27\2\5\1\30";

  private static int [] zzUnpackAction() {
    int [] result = new int[82];
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
    "\0\0\0\64\0\150\0\234\0\64\0\64\0\320\0\u0104"+
    "\0\u0138\0\u016c\0\u016c\0\u016c\0\u01a0\0\u01d4\0\u0208\0\u023c"+
    "\0\u0270\0\u02a4\0\u02d8\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc"+
    "\0\64\0\64\0\64\0\64\0\64\0\64\0\64\0\64"+
    "\0\64\0\u0410\0\u0444\0\u0138\0\64\0\64\0\u0104\0\u0478"+
    "\0\u04ac\0\u04e0\0\u0514\0\u0548\0\u057c\0\u05b0\0\u05e4\0\u0618"+
    "\0\u064c\0\u0680\0\u06b4\0\u06e8\0\u071c\0\u0104\0\u0750\0\u0104"+
    "\0\u0784\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u0888\0\u08bc\0\u08f0"+
    "\0\u0924\0\64\0\u0958\0\u098c\0\u09c0\0\u09f4\0\u0a28\0\u0a5c"+
    "\0\u0a90\0\u0ac4\0\u0af8\0\u0104\0\u0b2c\0\u0104\0\u0104\0\u0b60"+
    "\0\u0b94\0\u0104";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[82];
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
    "\1\2\1\3\1\4\1\5\2\3\1\6\1\7\1\10"+
    "\1\11\1\5\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\10\1\20\1\10\1\21\1\22\1\23\1\10\1\24"+
    "\2\10\1\25\3\10\1\26\5\10\1\27\1\30\3\10"+
    "\1\2\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\65\0\1\3\2\0\2\3\60\0\1\42"+
    "\1\43\66\0\2\7\62\0\3\10\5\0\35\10\11\0"+
    "\4\44\2\0\3\44\1\45\52\44\13\0\1\46\56\0"+
    "\3\10\5\0\1\10\1\47\12\10\1\50\20\10\17\0"+
    "\3\10\5\0\5\10\1\51\27\10\17\0\3\10\5\0"+
    "\3\10\1\52\10\10\1\53\15\10\1\53\2\10\17\0"+
    "\3\10\5\0\12\10\1\54\3\10\1\55\16\10\17\0"+
    "\3\10\5\0\2\10\1\56\32\10\17\0\3\10\5\0"+
    "\5\10\1\47\27\10\17\0\3\10\5\0\11\10\1\57"+
    "\23\10\17\0\3\10\5\0\4\10\1\60\1\61\27\10"+
    "\17\0\3\10\5\0\6\10\1\62\13\10\1\63\12\10"+
    "\17\0\3\10\5\0\6\10\1\63\13\10\1\63\12\10"+
    "\17\0\3\10\5\0\2\10\1\64\25\10\1\64\4\10"+
    "\17\0\3\10\5\0\14\10\1\53\15\10\1\53\2\10"+
    "\11\0\5\42\1\0\56\42\3\43\1\65\60\43\6\0"+
    "\3\10\5\0\16\10\1\66\16\10\17\0\3\10\5\0"+
    "\6\10\1\47\26\10\17\0\3\10\5\0\4\10\1\67"+
    "\30\10\17\0\3\10\5\0\7\10\1\70\23\10\1\70"+
    "\1\10\17\0\3\10\5\0\13\10\1\71\21\10\17\0"+
    "\3\10\5\0\6\10\1\72\26\10\17\0\3\10\5\0"+
    "\16\10\1\73\16\10\17\0\3\10\5\0\1\74\34\10"+
    "\17\0\3\10\5\0\16\10\1\75\16\10\17\0\3\10"+
    "\5\0\14\10\1\76\20\10\17\0\3\10\5\0\1\77"+
    "\4\10\1\100\15\10\1\100\11\10\17\0\3\10\5\0"+
    "\5\10\1\100\15\10\1\100\11\10\17\0\3\10\5\0"+
    "\20\10\1\101\3\10\1\101\10\10\11\0\2\43\1\102"+
    "\1\65\60\43\6\0\3\10\5\0\2\10\1\47\32\10"+
    "\17\0\3\10\5\0\14\10\1\47\20\10\17\0\3\10"+
    "\5\0\17\10\1\103\15\10\17\0\3\10\5\0\17\10"+
    "\1\104\15\10\17\0\3\10\5\0\3\10\1\67\31\10"+
    "\17\0\3\10\5\0\6\10\1\105\26\10\17\0\3\10"+
    "\5\0\4\10\1\106\30\10\17\0\3\10\5\0\14\10"+
    "\1\107\20\10\17\0\3\10\5\0\20\10\1\110\3\10"+
    "\1\110\10\10\17\0\3\10\5\0\1\111\30\10\1\111"+
    "\3\10\17\0\3\10\5\0\12\10\1\107\22\10\17\0"+
    "\3\10\5\0\6\10\1\112\26\10\17\0\3\10\5\0"+
    "\1\113\34\10\17\0\3\10\5\0\16\10\1\114\16\10"+
    "\17\0\3\10\5\0\16\10\1\47\16\10\17\0\3\10"+
    "\5\0\6\10\1\115\13\10\1\115\12\10\17\0\3\10"+
    "\5\0\14\10\1\116\15\10\1\116\2\10\17\0\3\10"+
    "\5\0\14\10\1\117\20\10\17\0\3\10\5\0\14\10"+
    "\1\120\20\10\17\0\3\10\5\0\13\10\1\121\11\10"+
    "\1\121\7\10\17\0\3\10\5\0\20\10\1\66\14\10"+
    "\17\0\3\10\5\0\26\10\1\122\6\10\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3016];
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
    "\1\1\1\11\2\1\2\11\22\1\11\11\1\1\2\0"+
    "\2\11\16\1\1\0\14\1\1\11\20\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[82];
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
// Hier kann beliebiger zu kopierender Code stehen.

	public static final int UNDEFTOK	= 255;
	public static final int WHITESPACE 	= 256;
	public static final int EOL		 	= 257;
	public static final int EOF		 	= 258;
	public static final int LPAR		= 259;
	public static final int RPAR		= 260;	
	public static final int LSBRACE		= 263;
	public static final int RSBRACE		= 264;
	public static final int BEGINSY		= 265;
	public static final int ENDSY		= 266;
	public static final int PROGRAMSY	= 283;//new
	public static final int BEGINBLOCK	= 284;
	public static final int ENDBLOCK	= 285;	
	public static final int ASSIGNOP 	= 286;
    public static final int COMMA		= 289;
    public static final int ENDOP		= 290;
    public static final int DOT			= 291;
	public static final int IDENTIFIER	= 301;
	public static final int INTEGER		= 302;
	//public static final int UINTEGER	= 303;
	//public static final int FLOAT		= 303;
	//public static final int CHAR		= 304;
	public static final int STRING		= 305;
	//public static final int BOOL		= 306;
	public static final int COMPARE		= 307;
	public static final int MATHOP		= 308;
	public static final int KEYWORD		= 309;
	//public static final int FUNCTION	= 310;
	public static final int DATATYPE	= 311;
	public static final int RETURNSY	= 312;
	public static final int CONSTSY		= 313;
	
	public static final int VAR			= 1000;
	public static final int CONST		= 1001;
       		
    static int intval; 
    static String strval;
    
    //static int lastDataType = 0;
    
    //public static SymTable symtable = new SymTable();
    
    public int getLine() {
    	return(yyline+1);
    }
    
    public int getColumn() {
    	return(yycolumn+1);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public MyScanner1(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public MyScanner1(java.io.InputStream in) {
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
    while (i < 154) {
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Yytoken yylex() throws java.io.IOException {
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
        case 16: 
          { return new Yytoken(ENDOP, yytext());
          }
        case 25: break;
        case 4: 
          { //intval = Integer.parseInt(yytext());
				//symtable.addSymbol(yytext(), CONST, INTEGER, "");
				return new Yytoken(INTEGER, yytext());
          }
        case 26: break;
        case 24: 
          { return new Yytoken(PROGRAMSY, yytext());
          }
        case 27: break;
        case 13: 
          { return new Yytoken(RSBRACE, yytext());
          }
        case 28: break;
        case 1: 
          { return new Yytoken(WHITESPACE, yytext());
          }
        case 29: break;
        case 23: 
          { return new Yytoken(RETURNSY, yytext());
          }
        case 30: break;
        case 5: 
          { //strval = new String(yytext()); 
				//symtable.addSymbol(strval, VAR, lastDataType, "");
				return new Yytoken(IDENTIFIER, yytext());
          }
        case 31: break;
        case 14: 
          { return new Yytoken(DOT, yytext());
          }
        case 32: break;
        case 15: 
          { return new Yytoken(COMMA, yytext());
          }
        case 33: break;
        case 6: 
          { return new Yytoken(ASSIGNOP, yytext());
          }
        case 34: break;
        case 19: 
          { String s = new String(yytext());
				//if(s.equals("int")) 	lastDataType = INTEGER;
				//if(s.equals("float")) 	lastDataType = FLOAT;
				//if(s.equals("char")) 	lastDataType = CHAR;
				//if(s.equals("bool")) 	lastDataType = BOOL;
				//if(s.equals("cstring")) lastDataType = STRING;			
				
				//if(s.equals("int")) 	return new Yytoken(INTEGER, s);
				//if(s.equals("cstring")) return new Yytoken(STRING, s);
				return new Yytoken(DATATYPE, s);
          }
        case 35: break;
        case 18: 
          { return new Yytoken(KEYWORD, yytext());
          }
        case 36: break;
        case 9: 
          { return new Yytoken(ENDBLOCK, yytext());
          }
        case 37: break;
        case 20: 
          { return new Yytoken(ENDSY, yytext());
          }
        case 38: break;
        case 7: 
          { return new Yytoken(COMPARE, yytext());
          }
        case 39: break;
        case 17: 
          { //symtable.addSymbol(yytext(), CONST, STRING, "");
				return new Yytoken(STRING, yytext());
          }
        case 40: break;
        case 12: 
          { return new Yytoken(LSBRACE, yytext());
          }
        case 41: break;
        case 22: 
          { return new Yytoken(BEGINSY, yytext());
          }
        case 42: break;
        case 3: 
          { return new Yytoken(MATHOP, yytext());
          }
        case 43: break;
        case 11: 
          { return new Yytoken(RPAR, yytext());
          }
        case 44: break;
        case 2: 
          { System.err.println("Undefined token \"" + yytext() + "\" on line: " + (yyline+1) + ", column: " + (yycolumn+1) + "\n");
				return new Yytoken(UNDEFTOK, yytext());
          }
        case 45: break;
        case 8: 
          { return new Yytoken(BEGINBLOCK, yytext());
          }
        case 46: break;
        case 21: 
          { return new Yytoken(CONSTSY, yytext());
          }
        case 47: break;
        case 10: 
          { return new Yytoken(LPAR, yytext());
          }
        case 48: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              { 	return new Yytoken(EOF, new String());
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
