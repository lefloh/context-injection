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

import static org.junit.Assert.assertEquals;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import org.junit.Test;

/**
 * @author Florian Hirsch
 */
public class InjectionTest {
	
	@Test
	public void test() {
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://localhost:9090/context-injection/test").request().get();
		assertEquals(200, response.getStatus());
		client.close();
	}
	
}
