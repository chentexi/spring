/*
 * Copyright 2002-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.test.aot.generate;

import org.springframework.aot.generate.ClassNameGenerator;
import org.springframework.aot.generate.DefaultGenerationContext;
import org.springframework.aot.generate.GenerationContext;
import org.springframework.aot.generate.InMemoryGeneratedFiles;

/**
 * {@link GenerationContext} test implementation that uses
 * {@link InMemoryGeneratedFiles}.
 *
 * @author Stephane Nicoll
 * @author Sam Brannen
 * @since 6.0
 */
public class TestGenerationContext extends DefaultGenerationContext {

	/**
	 * Create an instance using the specified {@code target}.
	 * @param target the default target class to use
	 */
	public TestGenerationContext(Class<?> target) {
		this(new ClassNameGenerator(target));
	}

	/**
	 * Create an instance using the specified {@link ClassNameGenerator}.
	 * @param classNameGenerator the class name generator to use
	 */
	public TestGenerationContext(ClassNameGenerator classNameGenerator) {
		super(classNameGenerator, new InMemoryGeneratedFiles());
	}


	@Override
	public InMemoryGeneratedFiles getGeneratedFiles() {
		return (InMemoryGeneratedFiles) super.getGeneratedFiles();
	}

}
