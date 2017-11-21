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

trait SExpr

trait TTy extends SExpr

trait AtomTy extends TTy

trait NumberTy extends AtomTy

trait IntegerTy extends NumberTy

trait FunctionTy extends AtomTy

trait SymbolTy extends AtomTy

trait ListTy extends TTy

trait ConsTy extends ListTy

trait NilTy extends ListTy with SymbolTy
