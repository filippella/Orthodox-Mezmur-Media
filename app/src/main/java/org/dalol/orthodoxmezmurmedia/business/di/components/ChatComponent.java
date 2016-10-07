/*
 * Copyright (c) 2016 Amharic Mezmur Lyrics
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
 */

package org.dalol.orthodoxmezmurmedia.business.di.components;

import org.dalol.orthodoxmezmurmedia.business.di.modules.ChatModule;
import org.dalol.orthodoxmezmurmedia.business.di.scopes.PerJourney;
import org.dalol.orthodoxmezmurmedia.modules.chat.ChatActivity;

import dagger.Component;

/**
 * @author Filippo Engidashet <filippo.eng@gmail.com>
 * @version 1.0.0
 * @since 9/11/2016
 */
@PerJourney
@Component(modules = ChatModule.class, dependencies = ApplicationComponent.class)
public interface ChatComponent {

    void inject(ChatActivity activity);
}
