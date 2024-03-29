package com.project.questapp.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCommentRequest {
	
	private Long id;
	private Long userId;
	private Long postId;
	private String text;

}
