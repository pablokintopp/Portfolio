package com.examples.android.pablokintopp.advancedandroid.data;

import io.reactivex.Single;
import retrofit2.http.GET;

/**
 * Created by Pablo on 09/03/2018.
 */

public interface RepoService {

    @GET("search/repositories?q=language:java&order=desc&sort=stars")
    Single<TrendingReposResponse> getTrendingRepos();
}
