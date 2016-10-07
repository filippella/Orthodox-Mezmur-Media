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

package org.dalol.orthodoxmezmurmedia.mvp.model.miscellaneous;

/**
 * @author Filippo Engidashet <filippo.eng@gmail.com>
 * @version 1.0.0
 * @since 10/2/2016
 */
public interface ItemView {

    int getViewType();

    enum ItemViewType {

        TYPE_PICTURE_ITEM(0),

        TYPE_PROGRESS_ITEM(1);

        private final int mViewType;

        ItemViewType(int index) {
            mViewType = index;
        }

        public int getViewType() {
            return mViewType;
        }
    }
}
