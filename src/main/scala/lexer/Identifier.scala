package lexer

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

sealed trait Identifier {
  val identifier: String
}

case class Plus() extends Identifier {
  override val identifier: String = "+"
}

case class Minus() extends Identifier {
  override val identifier: String = "-"
}

case class Multiply() extends Identifier {
  override val identifier: String = "*"
}

case class Divide() extends Identifier {
  override val identifier: String = "/"
}

case class Remainder() extends Identifier {
  override val identifier: String = "%"
}

case class StartBracket() extends Identifier {
  override val identifier: String = "("
}

case class EndBracket() extends Identifier {
  override val identifier: String = ")"
}
