# Strava client RestTemplate

Strava API v3
- API version: 3.0.0

The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.github.jfermat</groupId>
  <artifactId>strava-api-client-resttemplate</artifactId>
  <version>1.0.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.github.jfermat:strava-api-client-resttemplate:1.0.2"
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.github.jfermat.strava.invoker.*;
import io.github.jfermat.strava.invoker.auth.*;
import io.github.jfermat.strava.model.*;
import io.github.jfermat.strava.api.ActivitiesApi;

import java.io.File;
import java.util.*;

public class ActivitiesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi();
        String name = "name_example"; // String | 
        String type = "type_example"; // String | 
        OffsetDateTime startDateLocal = new OffsetDateTime(); // OffsetDateTime | 
        Integer elapsedTime = 56; // Integer | 
        String description = "description_example"; // String | 
        Float distance = 3.4F; // Float | 
        Integer trainer = 56; // Integer | 
        Integer commute = 56; // Integer | 
        try {
            DetailedActivity result = apiInstance.createActivity(name, type, startDateLocal, elapsedTime, description, distance, trainer, commute);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#createActivity");
            e.printStackTrace();
        }
    }
}
import io.github.jfermat.strava.invoker.*;
import io.github.jfermat.strava.invoker.auth.*;
import io.github.jfermat.strava.model.*;
import io.github.jfermat.strava.api.ActivitiesApi;

import java.io.File;
import java.util.*;

public class ActivitiesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi();
        Long id = 789L; // Long | The identifier of the activity.
        Boolean includeAllEfforts = true; // Boolean | To include all segments efforts.
        try {
            DetailedActivity result = apiInstance.getActivityById(id, includeAllEfforts);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getActivityById");
            e.printStackTrace();
        }
    }
}
import io.github.jfermat.strava.invoker.*;
import io.github.jfermat.strava.invoker.auth.*;
import io.github.jfermat.strava.model.*;
import io.github.jfermat.strava.api.ActivitiesApi;

import java.io.File;
import java.util.*;

public class ActivitiesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi();
        Long id = 789L; // Long | The identifier of the activity.
        Integer page = 56; // Integer | Page number. Defaults to 1.
        Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
        try {
            List<Comment> result = apiInstance.getCommentsByActivityId(id, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getCommentsByActivityId");
            e.printStackTrace();
        }
    }
}
import io.github.jfermat.strava.invoker.*;
import io.github.jfermat.strava.invoker.auth.*;
import io.github.jfermat.strava.model.*;
import io.github.jfermat.strava.api.ActivitiesApi;

import java.io.File;
import java.util.*;

public class ActivitiesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi();
        Long id = 789L; // Long | The identifier of the activity.
        Integer page = 56; // Integer | Page number. Defaults to 1.
        Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
        try {
            List<SummaryAthlete> result = apiInstance.getKudoersByActivityId(id, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getKudoersByActivityId");
            e.printStackTrace();
        }
    }
}
import io.github.jfermat.strava.invoker.*;
import io.github.jfermat.strava.invoker.auth.*;
import io.github.jfermat.strava.model.*;
import io.github.jfermat.strava.api.ActivitiesApi;

import java.io.File;
import java.util.*;

public class ActivitiesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi();
        Long id = 789L; // Long | The identifier of the activity.
        try {
            List<Lap> result = apiInstance.getLapsByActivityId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getLapsByActivityId");
            e.printStackTrace();
        }
    }
}
import io.github.jfermat.strava.invoker.*;
import io.github.jfermat.strava.invoker.auth.*;
import io.github.jfermat.strava.model.*;
import io.github.jfermat.strava.api.ActivitiesApi;

import java.io.File;
import java.util.*;

public class ActivitiesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi();
        Integer before = 56; // Integer | An epoch timestamp to use for filtering activities that have taken place before a certain time.
        Integer after = 56; // Integer | An epoch timestamp to use for filtering activities that have taken place after a certain time.
        Integer page = 56; // Integer | Page number. Defaults to 1.
        Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
        try {
            List<SummaryActivity> result = apiInstance.getLoggedInAthleteActivities(before, after, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getLoggedInAthleteActivities");
            e.printStackTrace();
        }
    }
}
import io.github.jfermat.strava.invoker.*;
import io.github.jfermat.strava.invoker.auth.*;
import io.github.jfermat.strava.model.*;
import io.github.jfermat.strava.api.ActivitiesApi;

import java.io.File;
import java.util.*;

public class ActivitiesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi();
        Long id = 789L; // Long | The identifier of the activity.
        try {
            List<ActivityZone> result = apiInstance.getZonesByActivityId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getZonesByActivityId");
            e.printStackTrace();
        }
    }
}
import io.github.jfermat.strava.invoker.*;
import io.github.jfermat.strava.invoker.auth.*;
import io.github.jfermat.strava.model.*;
import io.github.jfermat.strava.api.ActivitiesApi;

import java.io.File;
import java.util.*;

public class ActivitiesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi();
        Long id = 789L; // Long | The identifier of the activity.
        UpdatableActivity body = new UpdatableActivity(); // UpdatableActivity | 
        try {
            DetailedActivity result = apiInstance.updateActivityById(id, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#updateActivityById");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://www.strava.com/api/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActivitiesApi* | [**createActivity**](docs/ActivitiesApi.md#createActivity) | **POST** /activities | Create an Activity
*ActivitiesApi* | [**getActivityById**](docs/ActivitiesApi.md#getActivityById) | **GET** /activities/{id} | Get Activity
*ActivitiesApi* | [**getCommentsByActivityId**](docs/ActivitiesApi.md#getCommentsByActivityId) | **GET** /activities/{id}/comments | List Activity Comments
*ActivitiesApi* | [**getKudoersByActivityId**](docs/ActivitiesApi.md#getKudoersByActivityId) | **GET** /activities/{id}/kudos | List Activity Kudoers
*ActivitiesApi* | [**getLapsByActivityId**](docs/ActivitiesApi.md#getLapsByActivityId) | **GET** /activities/{id}/laps | List Activity Laps
*ActivitiesApi* | [**getLoggedInAthleteActivities**](docs/ActivitiesApi.md#getLoggedInAthleteActivities) | **GET** /athlete/activities | List Athlete Activities
*ActivitiesApi* | [**getZonesByActivityId**](docs/ActivitiesApi.md#getZonesByActivityId) | **GET** /activities/{id}/zones | Get Activity Zones
*ActivitiesApi* | [**updateActivityById**](docs/ActivitiesApi.md#updateActivityById) | **PUT** /activities/{id} | Update Activity
*AthletesApi* | [**getLoggedInAthlete**](docs/AthletesApi.md#getLoggedInAthlete) | **GET** /athlete | Get Authenticated Athlete
*AthletesApi* | [**getLoggedInAthleteZones**](docs/AthletesApi.md#getLoggedInAthleteZones) | **GET** /athlete/zones | Get Zones
*AthletesApi* | [**getStats**](docs/AthletesApi.md#getStats) | **GET** /athletes/{id}/stats | Get Athlete Stats
*AthletesApi* | [**updateLoggedInAthlete**](docs/AthletesApi.md#updateLoggedInAthlete) | **PUT** /athlete | Update Athlete
*ClubsApi* | [**getClubActivitiesById**](docs/ClubsApi.md#getClubActivitiesById) | **GET** /clubs/{id}/activities | List Club Activities
*ClubsApi* | [**getClubAdminsById**](docs/ClubsApi.md#getClubAdminsById) | **GET** /clubs/{id}/admins | List Club Administrators
*ClubsApi* | [**getClubById**](docs/ClubsApi.md#getClubById) | **GET** /clubs/{id} | Get Club
*ClubsApi* | [**getClubMembersById**](docs/ClubsApi.md#getClubMembersById) | **GET** /clubs/{id}/members | List Club Members
*ClubsApi* | [**getLoggedInAthleteClubs**](docs/ClubsApi.md#getLoggedInAthleteClubs) | **GET** /athlete/clubs | List Athlete Clubs
*GearsApi* | [**getGearById**](docs/GearsApi.md#getGearById) | **GET** /gear/{id} | Get Equipment
*RoutesApi* | [**getRouteAsGPX**](docs/RoutesApi.md#getRouteAsGPX) | **GET** /routes/{id}/export_gpx | Export Route GPX
*RoutesApi* | [**getRouteAsTCX**](docs/RoutesApi.md#getRouteAsTCX) | **GET** /routes/{id}/export_tcx | Export Route TCX
*RoutesApi* | [**getRouteById**](docs/RoutesApi.md#getRouteById) | **GET** /routes/{id} | Get Route
*RoutesApi* | [**getRoutesByAthleteId**](docs/RoutesApi.md#getRoutesByAthleteId) | **GET** /athletes/{id}/routes | List Athlete Routes
*RunningRacesApi* | [**getRunningRaceById**](docs/RunningRacesApi.md#getRunningRaceById) | **GET** /running_races/{id} | Get Running Race
*RunningRacesApi* | [**getRunningRaces**](docs/RunningRacesApi.md#getRunningRaces) | **GET** /running_races | List Running Races
*SegmentEffortsApi* | [**getEffortsBySegmentId**](docs/SegmentEffortsApi.md#getEffortsBySegmentId) | **GET** /segment_efforts | List Segment Efforts
*SegmentEffortsApi* | [**getSegmentEffortById**](docs/SegmentEffortsApi.md#getSegmentEffortById) | **GET** /segment_efforts/{id} | Get Segment Effort
*SegmentsApi* | [**exploreSegments**](docs/SegmentsApi.md#exploreSegments) | **GET** /segments/explore | Explore segments
*SegmentsApi* | [**getLoggedInAthleteStarredSegments**](docs/SegmentsApi.md#getLoggedInAthleteStarredSegments) | **GET** /segments/starred | List Starred Segments
*SegmentsApi* | [**getSegmentById**](docs/SegmentsApi.md#getSegmentById) | **GET** /segments/{id} | Get Segment
*SegmentsApi* | [**starSegment**](docs/SegmentsApi.md#starSegment) | **PUT** /segments/{id}/starred | Star Segment
*StreamsApi* | [**getActivityStreams**](docs/StreamsApi.md#getActivityStreams) | **GET** /activities/{id}/streams | Get Activity Streams
*StreamsApi* | [**getRouteStreams**](docs/StreamsApi.md#getRouteStreams) | **GET** /routes/{id}/streams | Get Route Streams
*StreamsApi* | [**getSegmentEffortStreams**](docs/StreamsApi.md#getSegmentEffortStreams) | **GET** /segment_efforts/{id}/streams | Get Segment Effort Streams
*StreamsApi* | [**getSegmentStreams**](docs/StreamsApi.md#getSegmentStreams) | **GET** /segments/{id}/streams | Get Segment Streams
*UploadsApi* | [**createUpload**](docs/UploadsApi.md#createUpload) | **POST** /uploads | Upload Activity
*UploadsApi* | [**getUploadById**](docs/UploadsApi.md#getUploadById) | **GET** /uploads/{uploadId} | Get Upload

## Documentation for Models

 - [ActivityStats](docs/ActivityStats.md)
 - [ActivityTotal](docs/ActivityTotal.md)
 - [ActivityType](docs/ActivityType.md)
 - [ActivityZone](docs/ActivityZone.md)
 - [AltitudeStream](docs/AltitudeStream.md)
 - [BaseStream](docs/BaseStream.md)
 - [Body](docs/Body.md)
 - [Body1](docs/Body1.md)
 - [Body2](docs/Body2.md)
 - [CadenceStream](docs/CadenceStream.md)
 - [Comment](docs/Comment.md)
 - [DetailedActivity](docs/DetailedActivity.md)
 - [DetailedAthlete](docs/DetailedAthlete.md)
 - [DetailedClub](docs/DetailedClub.md)
 - [DetailedGear](docs/DetailedGear.md)
 - [DetailedSegment](docs/DetailedSegment.md)
 - [DetailedSegmentEffort](docs/DetailedSegmentEffort.md)
 - [DistanceStream](docs/DistanceStream.md)
 - [Error](docs/Error.md)
 - [ExplorerResponse](docs/ExplorerResponse.md)
 - [ExplorerSegment](docs/ExplorerSegment.md)
 - [Fault](docs/Fault.md)
 - [HeartRateZoneRanges](docs/HeartRateZoneRanges.md)
 - [HeartrateStream](docs/HeartrateStream.md)
 - [Lap](docs/Lap.md)
 - [LatLng](docs/LatLng.md)
 - [LatLngStream](docs/LatLngStream.md)
 - [MetaActivity](docs/MetaActivity.md)
 - [MetaAthlete](docs/MetaAthlete.md)
 - [MetaClub](docs/MetaClub.md)
 - [MovingStream](docs/MovingStream.md)
 - [PhotosSummary](docs/PhotosSummary.md)
 - [PhotosSummaryPrimary](docs/PhotosSummaryPrimary.md)
 - [PolylineMap](docs/PolylineMap.md)
 - [PowerStream](docs/PowerStream.md)
 - [PowerZoneRanges](docs/PowerZoneRanges.md)
 - [Route](docs/Route.md)
 - [RunningRace](docs/RunningRace.md)
 - [SmoothGradeStream](docs/SmoothGradeStream.md)
 - [SmoothVelocityStream](docs/SmoothVelocityStream.md)
 - [Split](docs/Split.md)
 - [StreamSet](docs/StreamSet.md)
 - [SummaryActivity](docs/SummaryActivity.md)
 - [SummaryAthlete](docs/SummaryAthlete.md)
 - [SummaryClub](docs/SummaryClub.md)
 - [SummaryGear](docs/SummaryGear.md)
 - [SummaryPRSegmentEffort](docs/SummaryPRSegmentEffort.md)
 - [SummarySegment](docs/SummarySegment.md)
 - [SummarySegmentEffort](docs/SummarySegmentEffort.md)
 - [TemperatureStream](docs/TemperatureStream.md)
 - [TimeStream](docs/TimeStream.md)
 - [TimedZoneDistribution](docs/TimedZoneDistribution.md)
 - [TimedZoneRange](docs/TimedZoneRange.md)
 - [UpdatableActivity](docs/UpdatableActivity.md)
 - [Upload](docs/Upload.md)
 - [ZoneRange](docs/ZoneRange.md)
 - [ZoneRanges](docs/ZoneRanges.md)
 - [Zones](docs/Zones.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### strava_oauth

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://www.strava.com/api/v3/oauth/authorize
- **Scopes**: 
  - : 


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.