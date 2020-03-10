package com.grana.farmerapp.services.authorization;

import com.grana.farmerapp.model.authorization.UserDTO;
import com.grana.farmerapp.model.common.PagingAndFilterRequest;
import com.grana.farmerapp.model.common.PagingAndFilterResponse;

import java.util.Collection;
import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UserService {
    @GET
    public Observable<Collection<UserDTO>> getAll();

    @GET("/with-includes-only-non-deleted")
    public Observable<Collection<UserDTO>> getAllExceptDeleted();

    @GET("/{id}")
    public UserDTO get(@Path("id") Long id);

    @POST
    public UserDTO save(UserDTO resource);

    @DELETE("/{ids}")
    public Boolean delete(@Path("ids") List<Long> ids);

    @PUT
    public UserDTO update(UserDTO resource);

    @POST("/with-filter-and-paging")
    public PagingAndFilterResponse<UserDTO> getResourceByFilterAndPaging(PagingAndFilterRequest pagingAndFilterRequest);

    @POST("/with-filter-and-paging/with-includes-only-non-deleted")
    public PagingAndFilterResponse<UserDTO> getResourceByFilterAndPagingExceptDeleted(PagingAndFilterRequest pagingAndFilterRequest);
}