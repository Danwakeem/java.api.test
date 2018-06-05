/*******************************************************************************
 * Copyright (c) 2017 IBM Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/ 
package ks2inc.api.rest;

import java.util.HashMap;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

import com.google.gson.Gson;

@ApplicationPath("api")
@Path("/test")
public class TestAPI extends Application {
	 @GET
	 @Path("/")
	 @Produces({"application/json"})
	 public String getSampleJSON() {
		 HashMap<String, String> hash = new HashMap<String, String>();
		 hash.put("Hello", "World");
		 
		 return new Gson().toJson(hash);
	 }
}