/*
 * Copyright (C) 2020 The Android Open Source Project
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

package com.android.car.ui.recyclerview;

/**
 * A trivial implementation that doesn't do any filtering (simplifies the filter's code).
 */
public class PassThroughFilter implements RangeFilter {
    private int mCount;

    @Override
    public void recompute(int newCount, int pivotIndex) {
        mCount = newCount;
    }

    @Override
    public void notifyPivotIndexChanged(int pivotIndex) {
    }

    @Override
    public int getFilteredCount() {
        return mCount;
    }

    @Override
    public int indexToPosition(int index) {
        return index;
    }

    @Override
    public int positionToIndex(int position) {
        return position;
    }

    @Override
    public void invalidateMessagePositions() {
    }

    @Override
    public void applyFilter() {
    }

    @Override
    public void removeFilter() {
    }
}
