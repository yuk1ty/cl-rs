package eval

import exception.MiniLispException
import sexpr.SExpr
import tokens.Token

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

trait Evaluator {

  def eval(tokens: Seq[Token]): Either[MiniLispException, Seq[SExpr]] = ???
}

object Evaluator extends Evaluator

trait UsesEvaluator {
  val evaluator: Evaluator = Evaluator
}

trait MixInEvaluator extends UsesEvaluator