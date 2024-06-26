/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.journal.diaryko.endpoint.rest.api;

import com.journal.diaryko.endpoint.rest.model.Audio;
import com.journal.diaryko.endpoint.rest.model.BadRequestException;
import com.journal.diaryko.endpoint.rest.model.InternalServerException;
import com.journal.diaryko.endpoint.rest.model.Photo;
import com.journal.diaryko.endpoint.rest.model.ResourceNotFoundException;
import com.journal.diaryko.endpoint.rest.model.Tag;
import com.journal.diaryko.endpoint.rest.model.TooManyRequestsException;
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
@io.swagger.v3.oas.annotations.tags.Tag(name = "Audio", description = "the Audio API")
public interface JournalsApi {

    /**
     * POST /journals/{jid}/audios : Add audio to journal entries
     *
     * @param jid  (required)
     * @param audio Audio to add (required)
     * @return Added audio (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "addAudio",
        summary = "Add audio to journal entries",
        tags = { "Audio" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Added audio", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Audio.class))
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
        method = RequestMethod.POST,
        value = "/journals/{jid}/audios",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    ResponseEntity<Audio> addAudio(
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid,
        @Parameter(name = "Audio", description = "Audio to add", required = true) @Valid @RequestBody Audio audio
    );


    /**
     * POST /journals/{jid}/tags : Add tag in journal entries
     *
     * @param jid  (required)
     * @param tag tag to add (required)
     * @return Added tag (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "addJournalTag",
        summary = "Add tag in journal entries",
        tags = { "Tag" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Added tag", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Tag.class))
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
        method = RequestMethod.POST,
        value = "/journals/{jid}/tags",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    ResponseEntity<Tag> addJournalTag(
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid,
        @Parameter(name = "Tag", description = "tag to add", required = true) @Valid @RequestBody Tag tag
    );


    /**
     * POST /journals/{jid}/photos : Add photo to journal entries
     *
     * @param jid  (required)
     * @param photo photo to add (required)
     * @return Added photo (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "addPhoto",
        summary = "Add photo to journal entries",
        tags = { "Photo" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Added photo", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Photo.class))
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
        method = RequestMethod.POST,
        value = "/journals/{jid}/photos",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    ResponseEntity<Photo> addPhoto(
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid,
        @Parameter(name = "Photo", description = "photo to add", required = true) @Valid @RequestBody Photo photo
    );


    /**
     * POST /journals/{jid}/videos : Add video to journal entries
     *
     * @param jid  (required)
     * @param video Video to add (required)
     * @return Added video (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "addVideo",
        summary = "Add video to journal entries",
        tags = { "Video" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Added video", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Video.class))
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
        method = RequestMethod.POST,
        value = "/journals/{jid}/videos",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    ResponseEntity<Video> addVideo(
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid,
        @Parameter(name = "Video", description = "Video to add", required = true) @Valid @RequestBody Video video
    );


    /**
     * DELETE /journals/{jid}/audios/{aid} : Delete audio to journal entries
     *
     * @param jid  (required)
     * @param aid  (required)
     * @return Deleted audio (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "deleteAudioById",
        summary = "Delete audio to journal entries",
        tags = { "Audio" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Deleted audio", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Audio.class))
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
        value = "/journals/{jid}/audios/{aid}",
        produces = { "application/json" }
    )
    
    ResponseEntity<Audio> deleteAudioById(
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid,
        @Parameter(name = "aid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("aid") String aid
    );


    /**
     * DELETE /journals/{jid}/tags/{tid} : Delete tag in journal entries
     *
     * @param jid  (required)
     * @param tid  (required)
     * @return Deleted tag (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "deleteJournalTag",
        summary = "Delete tag in journal entries",
        tags = { "Tag" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Deleted tag", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Tag.class))
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
        value = "/journals/{jid}/tags/{tid}",
        produces = { "application/json" }
    )
    
    ResponseEntity<Tag> deleteJournalTag(
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid,
        @Parameter(name = "tid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("tid") String tid
    );


    /**
     * DELETE /journals/{jid}/photos/{pid} : Delete photo to journal entries
     *
     * @param jid  (required)
     * @param pid  (required)
     * @return Deleted photo (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "deletePhotoById",
        summary = "Delete photo to journal entries",
        tags = { "Photo" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Deleted photo", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Photo.class))
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
        value = "/journals/{jid}/photos/{pid}",
        produces = { "application/json" }
    )
    
    ResponseEntity<Photo> deletePhotoById(
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid,
        @Parameter(name = "pid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("pid") String pid
    );


    /**
     * DELETE /journals/{jid}/videos/{vid} : Delete video to journal entries
     *
     * @param jid  (required)
     * @param vid  (required)
     * @return Deleted video (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "deleteVideoById",
        summary = "Delete video to journal entries",
        tags = { "Video" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Deleted video", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Video.class))
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
        value = "/journals/{jid}/videos/{vid}",
        produces = { "application/json" }
    )
    
    ResponseEntity<Video> deleteVideoById(
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid,
        @Parameter(name = "vid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("vid") String vid
    );


    /**
     * GET /journals/{jid}/audios/{aid} : get audio by id
     *
     * @param jid  (required)
     * @param aid  (required)
     * @return Identified audio (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "getAudioById",
        summary = "get audio by id",
        tags = { "Audio" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Identified audio", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Audio.class))
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
        value = "/journals/{jid}/audios/{aid}",
        produces = { "application/json" }
    )
    
    ResponseEntity<Audio> getAudioById(
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid,
        @Parameter(name = "aid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("aid") String aid
    );


    /**
     * GET /journals/{jid}/audios : get all audios by journal id
     *
     * @param jid  (required)
     * @return List of audios by journal id (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "getAudiosByJournalId",
        summary = "get all audios by journal id",
        tags = { "Audio" },
        responses = {
            @ApiResponse(responseCode = "200", description = "List of audios by journal id", content = {
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
        value = "/journals/{jid}/audios",
        produces = { "application/json" }
    )
    
    ResponseEntity<List<Audio>> getAudiosByJournalId(
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid
    );


    /**
     * GET /journals/{jid}/photos/{pid} : get photo by id
     *
     * @param jid  (required)
     * @param pid  (required)
     * @return Identified photo (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "getPhotoById",
        summary = "get photo by id",
        tags = { "Photo" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Identified photo", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Photo.class))
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
        value = "/journals/{jid}/photos/{pid}",
        produces = { "application/json" }
    )
    
    ResponseEntity<Photo> getPhotoById(
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid,
        @Parameter(name = "pid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("pid") String pid
    );


    /**
     * GET /journals/{jid}/photos : get all photos by journal entries id
     *
     * @param jid  (required)
     * @return List of photos by journal id (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "getPhotosByJournalId",
        summary = "get all photos by journal entries id",
        tags = { "Photo" },
        responses = {
            @ApiResponse(responseCode = "200", description = "List of photos by journal id", content = {
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
        value = "/journals/{jid}/photos",
        produces = { "application/json" }
    )
    
    ResponseEntity<List<Photo>> getPhotosByJournalId(
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid
    );


    /**
     * GET /journals/{jid}/tags : get all tags by journal entries id
     *
     * @param jid  (required)
     * @return List of tags by journal entries id (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "getTagsByJournalId",
        summary = "get all tags by journal entries id",
        tags = { "Tag" },
        responses = {
            @ApiResponse(responseCode = "200", description = "List of tags by journal entries id", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Tag.class)))
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
        value = "/journals/{jid}/tags",
        produces = { "application/json" }
    )
    
    ResponseEntity<List<Tag>> getTagsByJournalId(
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid
    );


    /**
     * GET /journals/{jid}/videos/{vid} : get video by id
     *
     * @param jid  (required)
     * @param vid  (required)
     * @return Identified video (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "getVideoById",
        summary = "get video by id",
        tags = { "Video" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Identified video", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Video.class))
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
        value = "/journals/{jid}/videos/{vid}",
        produces = { "application/json" }
    )
    
    ResponseEntity<Video> getVideoById(
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid,
        @Parameter(name = "vid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("vid") String vid
    );


    /**
     * GET /journals/{jid}/videos : get all videos by journal entries id
     *
     * @param jid  (required)
     * @return List of videos by journal id (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Too many requests to the API (status code 429)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "getVideosByJournalId",
        summary = "get all videos by journal entries id",
        tags = { "Video" },
        responses = {
            @ApiResponse(responseCode = "200", description = "List of videos by journal id", content = {
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
        value = "/journals/{jid}/videos",
        produces = { "application/json" }
    )
    
    ResponseEntity<List<Video>> getVideosByJournalId(
        @Parameter(name = "jid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("jid") String jid
    );

}
