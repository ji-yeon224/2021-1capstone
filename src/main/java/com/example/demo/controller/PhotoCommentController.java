package com.example.demo.controller;

import com.example.demo.model.PhotoComment;
import com.example.demo.service.PhotoCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/photo_cmt")
public class PhotoCommentController {

    @Autowired
    private PhotoCommentService photoCommentService;

    // 글 번호에 따라 해당 글의 댓글 가져오기
    @GetMapping("/{pboardNo}")
    @PreAuthorize("permitAll()")
    public List<PhotoComment> getAllPhotoComments(@PathVariable Integer pboardNo) {
        return photoCommentService.getPhotoCommentById(pboardNo);
    }

    // 댓글 작성
    @PostMapping("/{pboardNo}")
    @PreAuthorize("permitAll()")
    public PhotoComment createPhotoComment(@RequestBody PhotoComment photoComment, @PathVariable Integer pboardNo) {
        return photoCommentService.createPhotoComment(photoComment, pboardNo);
    }

    // update comment
    @PutMapping("/{pboardNo}/{pcommentNo}")
    @PreAuthorize("permitAll()")
    public ResponseEntity<PhotoComment> updatePhotoCommentByNo(
            @PathVariable Integer pcommentNo, @RequestBody PhotoComment updateComment, @PathVariable Integer pboardNo){
        return photoCommentService.updatePhotoComment(pcommentNo, updateComment, pboardNo);
    }

    // delete board by 댓글 id
    @DeleteMapping("{pboardNo}/{pcommentNo}")
    @PreAuthorize("permitAll()")
    public ResponseEntity<Map<String, Boolean>> deletePhotoCommentByNo(
            @PathVariable Integer pcommentNo, @PathVariable Integer pboardNo) {

        return photoCommentService.deletePhotoComment(pcommentNo, pboardNo);
    }

}
