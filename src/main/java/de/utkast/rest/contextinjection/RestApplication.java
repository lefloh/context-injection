/**
 * Copyright (C) 2014 Florian Hirsch
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.utkast.rest.contextinjection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * @author Florian Hirsch
 */
@ApplicationPath("/")
public class RestApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		return new HashSet<>(Arrays.asList(TestResource.class));
	}

	@Override
	public Set<Object> getSingletons() {
		return new HashSet<>(Arrays.asList(new SomeFilter()));
	}

}
