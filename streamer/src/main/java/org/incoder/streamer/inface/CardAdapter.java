/*
 * Copyright (C) 2018 The Jerry xu Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.incoder.streamer.inface;

import android.support.v7.widget.CardView;

/**
 * CardAdapter.
 *
 * @author : Jerry xu
 * @since : 2018/11/16 00:32
 */
public interface CardAdapter {

    int MAX_ELEVATION_FACTOR = 8;

    /**
     * 得到数量
     *
     * @return count
     */
    int getCount();

    /**
     * 得到海拔
     *
     * @return Elevation
     */
    float getBaseElevation();

    /**
     * 根据位置获得CardView对象
     *
     * @param position 位置
     * @return CardView
     */
    CardView getCardViewAt(int position);


}
