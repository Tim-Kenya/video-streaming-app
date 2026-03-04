package com.video_streaming_app.movie_catalog_service.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MovieInfoRepository extends JpaRepository<MovieInfo, long> {

}
