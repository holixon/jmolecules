/*
 * Copyright 2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jmolecules.architecture.hexagonal;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An {@link SecondaryPort} describes abstractions that describes interfaces to the outside that are driven by the
 * application's core, like a repository (to interact with a database) or a message publisher. Usually
 * {@link SecondaryPort}s are implemented by {@link SecondaryAdapter}s.
 *
 * @author Oliver Drotbohm
 * @see <a href="https://alistair.cockburn.us/hexagonal-architecture/">Hexagonal Architecture</a>
 * @see SecondaryAdapter
 * @since 1.5
 */
@Port
@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.PACKAGE, ElementType.TYPE })
@Documented
public @interface SecondaryPort {}
