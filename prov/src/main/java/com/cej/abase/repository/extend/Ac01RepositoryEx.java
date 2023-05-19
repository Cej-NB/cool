package com.cej.abase.repository.extend;


import com.cej.abase.domain.Ac01;

import java.util.List;

public interface Ac01RepositoryEx {

    List<Ac01> findTopAc01(int maxResult);
}
