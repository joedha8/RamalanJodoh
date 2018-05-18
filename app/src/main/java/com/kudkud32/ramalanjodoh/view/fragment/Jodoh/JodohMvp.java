package com.kudkud32.ramalanjodoh.view.fragment.Jodoh;

import com.kudkud32.ramalanjodoh.model.DataWeton;

/**
 * Created by joedhaalzelvin on 18/05/18.
 */

public interface JodohMvp {
    void showDataWeton(DataWeton dataWeton);
    void showError(String message);
}
