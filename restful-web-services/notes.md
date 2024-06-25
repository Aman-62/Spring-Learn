### What's happening in the Background?

1. Hou are our request handled?
   DispatcherServlet - Front Controller Pattern

    > Mapping servlets: DispatcherServlet urt=[/]  
    > Auto Configuration(DispatcherServletAutoConfiguration)

2. How does HelloWorldBean Object get converted to JSON?

    > @ResponseBody + JacksonHttpMessageConverts
    > Auto Configuration (JacksonHttpMessageConvertsConfiguration)

3. Who is configuring error mapping?
    > Auto Configuration (ErrorMvcAutoConfiguration)

### Social Media Application REST API

1. Build A REST API for a social media application

2. Key Resources:

    > Users  
    > Posts

3. Key Details:
    > User: id, name, birthDate  
    > Post: id, description

### Request Methods for REST API

1. GET - Retrieve details of a resource
2. POST - Create a new resource
3. PUT - Update an existing resource
4. PATCH: Update part of a resource
5. DELETE - Delete a resource

### Social Media Application - Resources & Methods

1.  Users REST API

    > Retrieve all users
    > GET /users

    > Create a User
    > POST /users

    > Retrieve one User
    > GET /users/{id} -> /users/1

    > Delete a User
    > Delete /users/{id}

2.  Posts REST API

    > Retrieve all posts for a user
    > GET /users/{id}/posts

    > Create a post for a User
    > POST /users/{id}/posts

    > Retrieve details of a post
    > GET /users/{id}/posts/{post_id} -> /users/1/posts/10

    > Delete a post
    > Delete /users/{id}/posts/{post_id}

> PLURALS
> /users
> /users/1
> /users/1/posts
> /users/1/posts/2

> WITHOUT PLURALS
> /user
> /user/1
> /user/1/post
> /user/1/post/2

## Response Status for REST API

### Return the correct response status

Important Response statuses

1. 200 - Success
2. 201 - Created
3. 204 - No Content
4. 401 - Unauthorized (when authorization fails)
5. 400 - Bad Request (such as validation error)
6. 404 - Resource is not found
7. 500 - Server error
