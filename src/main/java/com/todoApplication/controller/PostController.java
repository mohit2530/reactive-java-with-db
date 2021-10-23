package com.todoApplication.controller;

import com.todoApplication.generated.api.PostApi;
import com.todoApplication.generated.model.Post;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController implements PostApi {


    /**
     * POST /post/add : Add a new todo to the list of todos
     *
     * @param body     Todo object that needs to be added (required)
     * @param exchange
     * @return Request Ok (status code 200)
     */
    @Override
    public Mono<ResponseEntity<Void>> createPostByMethodPOST(@Valid Mono<Post> body, ServerWebExchange exchange) {
        return null;
    }

    /**
     * DELETE /post/{postId} : Deletes a post
     *
     * @param postId   Post id to delete (required)
     * @param exchange
     * @return Invalid ID supplied (status code 400)
     * or Internal Server Error (status code 500)
     */
    @Override
    public Mono<ResponseEntity<Void>> deletePostByMethodDELETE(Long postId, ServerWebExchange exchange) {
        return null;
    }

    /**
     * GET /post/findByStatus : Find post by status
     * Status that are at different lifecycle stages
     *
     * @param status   Status values that need to be considered for filter (required)
     * @param exchange
     * @return response is valid. (status code 200)
     * or Internal Server Error (status code 500)
     */
    @Override
    public Mono<ResponseEntity<Flux<Post>>> getListOfPostsByMethodGET(@NotNull @Valid List<String> status, ServerWebExchange exchange) {
        return null;
    }

    /**
     * GET /post/{postId} : Find post by id
     * Returns a single post
     *
     * @param postId   ID of post to return (required)
     * @param exchange
     * @return successful operation (status code 200)
     * or Invalid ID supplied (status code 400)
     * or Internal Server Error (status code 500)
     */
    @Override
    public Mono<ResponseEntity<Post>> getPostByMethodGET(Long postId, ServerWebExchange exchange) {
        return null;
    }
}
