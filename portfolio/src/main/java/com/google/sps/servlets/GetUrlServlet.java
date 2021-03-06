// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.servlets;

import com.google.appengine.api.blobstore.BlobInfo;
import com.google.appengine.api.blobstore.BlobInfoFactory;
import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;
import com.google.appengine.api.images.ImagesService;
import com.google.appengine.api.images.ImagesServiceFactory;
import com.google.appengine.api.images.ServingUrlOptions;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.SortDirection;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet that returns some example content. TODO: modify this file to handle
 * comments data
 */
@WebServlet("/getUrl")
public class GetUrlServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();
    
        // Query query = new Query("Image").addSort("timestamp", SortDirection.DESCENDING);
        // DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        // PreparedQuery results = datastore.prepare(query);
        String uploadUrl = blobstoreService.createUploadUrl("/image");

        // System.out.println("image url is " + uploadUrl);

        // List<Image> images = new ArrayList<>();
        // for (Entity entity : results.asIterable()) {
        //     long id = entity.getKey().getId();
        //     long timestamp = (long) entity.getProperty("timestamp");

        // System.out.println("image url is " + uploadUrl);

            // Image image = new Image(id, uploadUrl, timestamp);
            // images.add(image);
        // }
        // String json = new Gson().toJson(images);
        // response.setContentType("application/json;");
        // response.getWriter().println(json);
        // System.out.println("json is "+json);

    }
}
