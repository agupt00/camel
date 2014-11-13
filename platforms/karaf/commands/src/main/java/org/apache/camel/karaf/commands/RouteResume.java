/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.karaf.commands;

import org.apache.camel.commands.RouteResumeCommand;
import org.apache.felix.gogo.commands.Command;

/**
 * Command to resume a route.
 */
@Command(scope = "camel", name = "route-resume", description = "Resume a Camel route or a group of routes.")
public class RouteResume extends AbstractRouteCommand {

    @Override
    protected Object doExecute() throws Exception {
        RouteResumeCommand command = new RouteResumeCommand(route, context);
        return command.execute(camelController, System.out, System.err);
    }

}
