/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.journal.diaryko.endpoint.rest.api;

import com.journal.diaryko.endpoint.rest.model.Audio;
import com.journal.diaryko.endpoint.rest.model.BadRequestException;
import com.journal.diaryko.endpoint.rest.model.InternalServerException;
import com.journal.diaryko.endpoint.rest.model.JournalEntries;
import com.journal.diaryko.endpoint.rest.model.NotAuthorizedException;
import com.journal.diaryko.endpoint.rest.model.Photo;
import com.journal.diaryko.endpoint.rest.model.ResourceNotFoundException;
import com.journal.diaryko.endpoint.rest.model.TooManyRequestsException;
import com.journal.diaryko.endpoint.rest.model.User;
import com.journal.diaryko.endpoint.rest.model.Video;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-03T12:20:17.797583700+03:00[Africa/Nairobi]", comments = "Generator version: 7.5.0")
@Validated
@Tag(name = "JournalEntries", description = "the JournalEntries API")
public interface UsersApi {

    /**
     * PUT /users/{uid}/Journals/{jid} : create or update journal entries by id
     *
     * @param uid  (required)
     * @param jid  (required)
     * @param journalEntries Journal entries to create or update (required)
     * @return created or updated journal entries (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "crupdateJournalById",
        summary = "create or update journal entries by id",
        tags = { "JournalEntries" },
        responses = {
            @ApiResponse(responseCode = "200", description = "created or updated journal entries", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = JournalEntries.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BadRequestException.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ResourceNotFoundException.class))
            }),
            @ApiResponse(responseCode = "429", description = "Too many requests to the API", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TooManyRequestsException.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InternalServerException.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/users/{uid}/Journals/{jid}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    ResponseEntity<JournalEntries> crupdateJournalById(
        @Parameter(name = "uid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("uid") String uid,
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid,
        @Parameter(name = "JournalEntries", description = "Journal entries to create or update", required = true) @Valid @RequestBody JournalEntries journalEntries
    );


    /**
     * PUT /users/{uid} : create or update user by id
     *
     * @param uid  (required)
     * @param user User to create or update (required)
     * @return created or updated user (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "crupdateUserById",
        summary = "create or update user by id",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "created or updated user", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BadRequestException.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ResourceNotFoundException.class))
            }),
            @ApiResponse(responseCode = "429", description = "Too many requests to the API", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TooManyRequestsException.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InternalServerException.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/users/{uid}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    ResponseEntity<User> crupdateUserById(
        @Parameter(name = "uid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("uid") String uid,
        @Parameter(name = "User", description = "User to create or update", required = true) @Valid @RequestBody User user
    );


    /**
     * DELETE /users/{uid}/Journals/{jid} : delete journal entries by id
     *
     * @param uid  (required)
     * @param jid  (required)
     * @return deleted journal entries (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "deleteJournalById",
        summary = "delete journal entries by id",
        tags = { "JournalEntries" },
        responses = {
            @ApiResponse(responseCode = "200", description = "deleted journal entries", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = JournalEntries.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BadRequestException.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ResourceNotFoundException.class))
            }),
            @ApiResponse(responseCode = "429", description = "Too many requests to the API", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TooManyRequestsException.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InternalServerException.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/users/{uid}/Journals/{jid}",
        produces = { "application/json" }
    )
    
    ResponseEntity<JournalEntries> deleteJournalById(
        @Parameter(name = "uid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("uid") String uid,
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid
    );


    /**
     * DELETE /users/{uid} : delete user by id
     *
     * @param uid  (required)
     * @return deleted user (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "deleteUserById",
        summary = "delete user by id",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "deleted user", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BadRequestException.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ResourceNotFoundException.class))
            }),
            @ApiResponse(responseCode = "429", description = "Too many requests to the API", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TooManyRequestsException.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InternalServerException.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/users/{uid}",
        produces = { "application/json" }
    )
    
    ResponseEntity<User> deleteUserById(
        @Parameter(name = "uid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("uid") String uid
    );


    /**
     * GET /users/{uid}/audios : get all audios by user id
     *
     * @param uid  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @return List of audios by user id (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "getAudiosByUserId",
        summary = "get all audios by user id",
        tags = { "Audio" },
        responses = {
            @ApiResponse(responseCode = "200", description = "List of audios by user id", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Audio.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BadRequestException.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ResourceNotFoundException.class))
            }),
            @ApiResponse(responseCode = "429", description = "Too many requests to the API", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TooManyRequestsException.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InternalServerException.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users/{uid}/audios",
        produces = { "application/json" }
    )
    
    ResponseEntity<List<Audio>> getAudiosByUserId(
        @Parameter(name = "uid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("uid") String uid,
        @NotNull @Parameter(name = "page", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "page", required = true) Integer page,
        @NotNull @Parameter(name = "page_size", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "page_size", required = true) Integer pageSize
    );


    /**
     * GET /users/{uid}/Journals/{jid} : get journal entries by id
     *
     * @param uid  (required)
     * @param jid  (required)
     * @return Journal entries by id (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "getJournalById",
        summary = "get journal entries by id",
        tags = { "JournalEntries" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Journal entries by id", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = JournalEntries.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BadRequestException.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ResourceNotFoundException.class))
            }),
            @ApiResponse(responseCode = "429", description = "Too many requests to the API", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TooManyRequestsException.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InternalServerException.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users/{uid}/Journals/{jid}",
        produces = { "application/json" }
    )
    
    ResponseEntity<JournalEntries> getJournalById(
        @Parameter(name = "uid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("uid") String uid,
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid
    );


    /**
     * GET /users/{uid}/Journals : get all journal entries by user id
     *
     * @param uid  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @return List of journal entries by user id (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "getJournalsByUserId",
        summary = "get all journal entries by user id",
        tags = { "JournalEntries" },
        responses = {
            @ApiResponse(responseCode = "200", description = "List of journal entries by user id", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = JournalEntries.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BadRequestException.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ResourceNotFoundException.class))
            }),
            @ApiResponse(responseCode = "429", description = "Too many requests to the API", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TooManyRequestsException.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InternalServerException.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users/{uid}/Journals",
        produces = { "application/json" }
    )
    
    ResponseEntity<List<JournalEntries>> getJournalsByUserId(
        @Parameter(name = "uid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("uid") String uid,
        @NotNull @Parameter(name = "page", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "page", required = true) Integer page,
        @NotNull @Parameter(name = "page_size", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "page_size", required = true) Integer pageSize
    );


    /**
     * GET /users/{uid}/photos : get all photos by user id
     *
     * @param uid  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @return List of photos by user id (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "getPhotosByUserId",
        summary = "get all photos by user id",
        tags = { "Photo" },
        responses = {
            @ApiResponse(responseCode = "200", description = "List of photos by user id", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Photo.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BadRequestException.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ResourceNotFoundException.class))
            }),
            @ApiResponse(responseCode = "429", description = "Too many requests to the API", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TooManyRequestsException.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InternalServerException.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users/{uid}/photos",
        produces = { "application/json" }
    )
    
    ResponseEntity<List<Photo>> getPhotosByUserId(
        @Parameter(name = "uid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("uid") String uid,
        @NotNull @Parameter(name = "page", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "page", required = true) Integer page,
        @NotNull @Parameter(name = "page_size", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "page_size", required = true) Integer pageSize
    );


    /**
     * GET /users/{uid} : get user by id
     *
     * @param uid  (required)
     * @return User by identifier (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "getUserById",
        summary = "get user by id",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User by identifier", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BadRequestException.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ResourceNotFoundException.class))
            }),
            @ApiResponse(responseCode = "429", description = "Too many requests to the API", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TooManyRequestsException.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InternalServerException.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users/{uid}",
        produces = { "application/json" }
    )
    
    ResponseEntity<User> getUserById(
        @Parameter(name = "uid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("uid") String uid
    );


    /**
     * GET /users : get all users
     *
     * @param page  (required)
     * @param pageSize  (required)
     * @return List of users (status code 200)
     *         or Bad request (status code 400)
     *         or Forbidden (status code 403)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "getUsers",
        summary = "get all users",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "List of users", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = User.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BadRequestException.class))
            }),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = NotAuthorizedException.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ResourceNotFoundException.class))
            }),
            @ApiResponse(responseCode = "429", description = "Too many requests to the API", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TooManyRequestsException.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InternalServerException.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users",
        produces = { "application/json" }
    )
    
    ResponseEntity<List<User>> getUsers(
        @NotNull @Parameter(name = "page", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "page", required = true) Integer page,
        @NotNull @Parameter(name = "page_size", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "page_size", required = true) Integer pageSize
    );


    /**
     * GET /users/{uid}/videos : get all videos by user id
     *
     * @param uid  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @return List of videos by user id (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "getVideosByUserId",
        summary = "get all videos by user id",
        tags = { "Video" },
        responses = {
            @ApiResponse(responseCode = "200", description = "List of videos by user id", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Video.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BadRequestException.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ResourceNotFoundException.class))
            }),
            @ApiResponse(responseCode = "429", description = "Too many requests to the API", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TooManyRequestsException.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InternalServerException.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users/{uid}/videos",
        produces = { "application/json" }
    )
    
    ResponseEntity<List<Video>> getVideosByUserId(
        @Parameter(name = "uid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("uid") String uid,
        @NotNull @Parameter(name = "page", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "page", required = true) Integer page,
        @NotNull @Parameter(name = "page_size", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "page_size", required = true) Integer pageSize
    );

}
