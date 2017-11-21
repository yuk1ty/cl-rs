package lexer

import tokens.{DoubleToken, IdentifierToken, NumberToken, Token}
import exception.MiniLispException

/*
 * Copyright 2017 Yuki Toyoda
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

trait Lexer {

  private lazy val ONLY_INTEGER: String = "\\d"

  private lazy val ONLY_DOUBLE: String = "\\d+\\.\\+\\d"

  private lazy val WHITE_SPACE: String = " "

  def parse(expr: String): Seq[Either[Throwable, Token]] =
    expr
      .split("")
      .toStream
      .filter(_ != WHITE_SPACE)
      .map { s =>
        val maybeIdentifier = s.findIdentifier()
        if (maybeIdentifier.isDefined) {
          Right(IdentifierToken(maybeIdentifier.get))
        } else if (s.matches(ONLY_INTEGER)) {
          Right(NumberToken(s.toInt))
        } else if (s.matches(ONLY_DOUBLE)) {
          Right(DoubleToken(s.toDouble))
        } else {
          Left(MiniLispException(s"文字列のパースに失敗しました: $s"))
        }
      }
      .toIndexedSeq
}

object Lexer extends Lexer

trait UsesLexer {
  val lexer: Lexer = Lexer
}
