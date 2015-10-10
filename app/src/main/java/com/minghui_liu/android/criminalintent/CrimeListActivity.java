package com.minghui_liu.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by kevin on 10/8/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
