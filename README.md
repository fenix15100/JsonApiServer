# JsonApiServer
Rest [JSON API](http://jsonapi.org/) 1.0 implemented with Elide.io & Dropwizard (Jetty+Jersey+Hibernate)

# How to use

1. Install and start a MySQL server

2. Create ```academicdb``` database

        mysql> create database academicdb;
    Can change user and password in app.yml file



4. Launch the webservice with maven or your IDE (main Class app.JsonApiServer.java)

        

5. Create an School

        $ curl -H'Content-Type: application/vnd.api+json' -H'Accept: application/vnd.api+json' --data '{
          "data": {
            "id": "-",
            "type": "school
            "attributes": {
              "name": "Instuto Escola industrial",
              "street": "Calle False 123"
            }
          }
        }' -X POST http://localhost:8080/school

6. Create a Course

        $ curl -H'Content-Type: application/vnd.api+json' -H'Accept: application/vnd.api+json' --data '{
          "data": {
            "id": "-",
            "type": "course
            "attributes": {
              "name":  "ESO",
              "grade": "2"
            }
          }
        }' -X POST http://localhost:8080/course

7. Associate the School and Course

        $ curl -H'Content-Type: application/vnd.api+json' -H'Accept: application/vnd.api+json' --data '{
          "data": {
            "id": "1",
            "type": "school"
          }
        }' -X PATCH http://localhost:8080/course/1/relationships/school

8. Get courses

        $ curl -H'Content-Type: application/vnd.api+json' -H'Accept: application/vnd.api+json' http://localhost:8080/course/

You can also load some pre-configured Schools and Courses using `DummyData.sql` in `Database` 
