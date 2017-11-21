package sexpr

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

sealed trait SExpr

//case class TTy() extends SExpr
//
//case class AtomTy() extends TTy
//
//case class NumberTy() extends AtomTy
//
//case class IntegerTy() extends NumberTy
//
//case class FunctionTy() extends AtomTy
//
//case class SymbolTy() extends AtomTy
//
//case class ListTy() extends TTy
//
//case class ConsTy() extends ListTy
//
//case class NilTy() extends ListTy
//
//case class SymbolNilTy() extends SymbolTy
