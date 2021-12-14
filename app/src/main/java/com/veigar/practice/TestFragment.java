package com.veigar.practice;

import androidx.fragment.app.Fragment;

/**
 * @description:
 * @author: houwj
 * @date: 2021/8/17
 */
class TestFragment extends Fragment {
    @Override
    public void setRetainInstance(boolean retain) {
        super.setRetainInstance(true);
    }
}
