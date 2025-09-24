package com.sparta.myselectshop.dto;

import com.sparta.myselectshop.entity.Folder;
import lombok.Getter;

@Getter
public class FolderReponseDto {
    private Long id;
    private String name;

    public FolderReponseDto(Folder folder){
        this.id = folder.getId();
        this.name = folder.getName();
    }
}
