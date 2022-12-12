package com.cieep.pmdm_b_08_retrofit.conexiones;

import com.cieep.pmdm_b_08_retrofit.modelos.Album;
import com.cieep.pmdm_b_08_retrofit.modelos.Photo;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiConexiones {

    // Todos los endpoint y retornos de la API

    @GET("/albums")
    Call<ArrayList<Album>> getAlbums();

    @GET("/albums/{idAlbum}")
    Call<Album> getAlbum(@Path("idAlbum") String idAlbum);

    // /photos?albumId=2
    @GET("/photos?")
    Call<ArrayList<Photo>> getPhostosAlbum(@Query("albumId") String idAlbum);


}
