/* Generated By:JJTree&JavaCC: Do not edit this line. ExpressionParserConstants.java */
/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/


package org.apache.cayenne.exp.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ExpressionParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int NULL = 33;
  /** RegularExpression Id. */
  int TRUE = 34;
  /** RegularExpression Id. */
  int FALSE = 35;
  /** RegularExpression Id. */
  int AVG = 36;
  /** RegularExpression Id. */
  int MIN = 37;
  /** RegularExpression Id. */
  int MAX = 38;
  /** RegularExpression Id. */
  int SUM = 39;
  /** RegularExpression Id. */
  int COUNT = 40;
  /** RegularExpression Id. */
  int DISTINCT = 41;
  /** RegularExpression Id. */
  int CONCAT = 42;
  /** RegularExpression Id. */
  int SUBSTRING = 43;
  /** RegularExpression Id. */
  int TRIM = 44;
  /** RegularExpression Id. */
  int LOWER = 45;
  /** RegularExpression Id. */
  int UPPER = 46;
  /** RegularExpression Id. */
  int LENGTH = 47;
  /** RegularExpression Id. */
  int LOCATE = 48;
  /** RegularExpression Id. */
  int ABS = 49;
  /** RegularExpression Id. */
  int SQRT = 50;
  /** RegularExpression Id. */
  int MOD = 51;
  /** RegularExpression Id. */
  int CURRENT_DATE = 52;
  /** RegularExpression Id. */
  int CURRENT_TIME = 53;
  /** RegularExpression Id. */
  int CURRENT_TIMESTAMP = 54;
  /** RegularExpression Id. */
  int YEAR = 55;
  /** RegularExpression Id. */
  int MONTH = 56;
  /** RegularExpression Id. */
  int WEEK = 57;
  /** RegularExpression Id. */
  int DAY_OF_YEAR = 58;
  /** RegularExpression Id. */
  int DAY = 59;
  /** RegularExpression Id. */
  int DAY_OF_MONTH = 60;
  /** RegularExpression Id. */
  int DAY_OF_WEEK = 61;
  /** RegularExpression Id. */
  int HOUR = 62;
  /** RegularExpression Id. */
  int MINUTE = 63;
  /** RegularExpression Id. */
  int SECOND = 64;
  /** RegularExpression Id. */
  int FUNCTION = 65;
  /** RegularExpression Id. */
  int OPERATOR = 66;
  /** RegularExpression Id. */
  int ASTERISK = 72;
  /** RegularExpression Id. */
  int PROPERTY_PATH = 73;
  /** RegularExpression Id. */
  int IDENTIFIER = 74;
  /** RegularExpression Id. */
  int LETTER = 75;
  /** RegularExpression Id. */
  int DIGIT = 76;
  /** RegularExpression Id. */
  int DOLLAR_SIGN = 77;
  /** RegularExpression Id. */
  int ESC = 80;
  /** RegularExpression Id. */
  int SINGLE_QUOTED_STRING = 82;
  /** RegularExpression Id. */
  int STRING_ESC = 83;
  /** RegularExpression Id. */
  int DOUBLE_QUOTED_STRING = 85;
  /** RegularExpression Id. */
  int INT_LITERAL = 86;
  /** RegularExpression Id. */
  int FLOAT_LITERAL = 87;
  /** RegularExpression Id. */
  int DEC_FLT = 88;
  /** RegularExpression Id. */
  int DEC_DIGITS = 89;
  /** RegularExpression Id. */
  int EXPONENT = 90;
  /** RegularExpression Id. */
  int FLT_SUFF = 91;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int WithinSingleQuoteLiteral = 1;
  /** Lexical state. */
  int WithinDoubleQuoteLiteral = 2;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\"or\"",
    "\"and\"",
    "\"not\"",
    "\"!\"",
    "\"=\"",
    "\"==\"",
    "\"!=\"",
    "\"<>\"",
    "\"<=\"",
    "\"<\"",
    "\">\"",
    "\">=\"",
    "\"like\"",
    "\"likeIgnoreCase\"",
    "\"in\"",
    "\"(\"",
    "\")\"",
    "\"between\"",
    "\",\"",
    "\"|\"",
    "\"^\"",
    "\"&\"",
    "\"<<\"",
    "\">>\"",
    "\"+\"",
    "\"-\"",
    "\"/\"",
    "\"~\"",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<NULL>",
    "<TRUE>",
    "<FALSE>",
    "\"avg\"",
    "\"min\"",
    "\"max\"",
    "\"sum\"",
    "\"count\"",
    "\"distinct\"",
    "\"concat\"",
    "\"substring\"",
    "\"trim\"",
    "\"lower\"",
    "\"upper\"",
    "\"length\"",
    "\"locate\"",
    "\"abs\"",
    "\"sqrt\"",
    "\"mod\"",
    "\"currentDate\"",
    "\"currentTime\"",
    "<CURRENT_TIMESTAMP>",
    "\"year\"",
    "\"month\"",
    "\"week\"",
    "\"dayOfYear\"",
    "\"day\"",
    "\"dayOfMonth\"",
    "\"dayOfWeek\"",
    "\"hour\"",
    "\"minute\"",
    "\"second\"",
    "\"fn\"",
    "\"op\"",
    "\"$\"",
    "\"obj:\"",
    "\"db:\"",
    "\"enum:\"",
    "\"dbid:\"",
    "\"*\"",
    "<PROPERTY_PATH>",
    "<IDENTIFIER>",
    "<LETTER>",
    "<DIGIT>",
    "<DOLLAR_SIGN>",
    "\"\\\'\"",
    "\"\\\"\"",
    "<ESC>",
    "<token of kind 81>",
    "\"\\\'\"",
    "<STRING_ESC>",
    "<token of kind 84>",
    "\"\\\"\"",
    "<INT_LITERAL>",
    "<FLOAT_LITERAL>",
    "<DEC_FLT>",
    "<DEC_DIGITS>",
    "<EXPONENT>",
    "<FLT_SUFF>",
  };

}
