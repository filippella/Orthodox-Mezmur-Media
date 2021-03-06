/*
 * Copyright (c) 2016 Orthodox Mezmur Media
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dalol.orthodoxmezmurmedia.basic.common;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Filippo Engidashet <filippo.eng@gmail.com>
 * @version 1.0.0
 * @since 11/6/2016
 */
public abstract class BaseRecyclerAdapter<H extends RecyclerView.ViewHolder, M> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    protected List<M> mContentList = new ArrayList<>();
    private LayoutInflater mLayoutInflater;

    public BaseRecyclerAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        H holder = onCreateHolder(mLayoutInflater, parent);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        bindHolder((H) holder, position);
    }

    @Override
    public int getItemCount() {
        return mContentList.size();
    }

    public void addItem(M content) {
        mContentList.add(content);
    }

    public void addList(List<M> itemList) {
        mContentList.addAll(itemList);
        notifyDataSetChanged();
    }

    protected abstract H onCreateHolder(LayoutInflater inflater, ViewGroup parent);

    protected abstract void bindHolder(H holder, int position);

    public void clear() {
        mContentList.clear();
    }
}
