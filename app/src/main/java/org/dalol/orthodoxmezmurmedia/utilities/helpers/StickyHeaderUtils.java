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

package org.dalol.orthodoxmezmurmedia.utilities.helpers;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import org.dalol.orthodoxmezmurmedia.modules.mezmur.adapter.MezmurListAdapter;

/**
 * Created by filippo.ash on 7/29/16.
 */
public final class StickyHeaderUtils {

    public static boolean isHeaderView(RecyclerView parent, MezmurListAdapter adapter, View secondView) {
        return adapter.shouldStartTranslate(parent.getChildAdapterPosition(secondView));
    }
}
