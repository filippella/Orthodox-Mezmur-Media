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

package org.dalol.presenter.business.pictures;


import org.dalol.model.pictures.PictureModel;
import org.dalol.model.pictures.PictureResponse;
import org.dalol.model.services.ApiType;
import org.dalol.presenter.business.base.BasePresenter;
import org.dalol.presenter.mappers.pictures.PicturesMapper;
import org.dalol.presenter.presentation.pictures.PicturesView;
import org.dalol.presenter.services.pictures.PicturesApi;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Response;

/**
 * @author Filippo Engidashet <filippo.eng@gmail.com>
 * @version 1.0.0
 * @since 10/2/2016
 */
public class PicturesPresenter extends BasePresenter<PicturesView, PictureResponse> {

    @Inject protected PicturesApi mPicturesApi;
    @Inject protected PicturesMapper mPicturesMapper;

    @Inject
    public PicturesPresenter() {
    }

    @Override
    public void onViewReady() {
        getView().onShowToast("Getting Pictures");
        enqueue(ApiType.PICTURE, mPicturesApi.getPictures());
    }

    @Override
    protected void onResponseRetrieved(boolean successful, Call<PictureResponse> call, Response<PictureResponse> response) {
        if(successful) {
            PictureModel pictureModel = mPicturesMapper.mapResponse(response.body());
            getView().onLoadPictures(pictureModel);
        }
    }
}