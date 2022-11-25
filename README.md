## Project Structure 📂

```
.
├── Themovie.kt
├── data
|   |
|   ├── api
|   |   ├── NetworkService.kt
|   |   └── SafeApiRequest.kt
│   ├── local
│   │   ├── BookmarkDatabase.kt
│   │   └── dao
│   │     └── BookmarkDao.kt
│   ├── model
│   │   ├── Actor.kt
│   │   ├── Cast.kt
│   │   ├── CastCreditResponse.kt
│   │   ├── Genre.kt
│   │   ├── Movie.kt
│   │   ├── MovieCreditsResponse.kt
│   │   ├── MovieDB.kt
│   │   ├── MovieResponse.kt
│   │   ├── Resourse.kt
│   │   ├── State.kt
│   │   ├── Video.kt
│   │   └── VideoResponse.kt
│   └── repository
│       └── NetworkRepository.kt
├── di
│   └── module
│       ├── ApiModule.kt
│       └── DatabaseModule.kt
├── ui
│   ├── SplashScreenActivity.kt
│   ├── adapter
│   |   ├── BestMoviesRecyclerViewAdapter.kt
│   |   ├── BookmarkRecyclerViewAdapter.kt
│   |   ├── CastRecyclerViewAdapter.kt
│   |   ├── HomeRecyclerViewAdapter.kt
│   |   ├── HomeViewPagerAdapter.kt
│   |   ├── SearchRecyclerViewAdapter.kt
│   |   ├── SimilarMoviesRecyclerViewAdapter.kt 
│   |   └── ViewAllRecyclerViewAdapter.kt
│   ├── details
│   |   ├── ActorDetailsFragment.kt
│   |   ├── ActorDetailsViewModel.kt
│   |   ├── MovieDetailsFragment.kt
│   |   └── MovieDetailsViewModel.kt
│   ├── dialog
│   |   └── VideoPlayer.kt
│   ├── home
│   |   ├── HomeFragment.kt
│   |   └── HomeViewModel.kt
│   ├── list
│   |   ├── ViewAllFragment.kt
│   |   └── ViewAllViewModel.kt
│   ├── main
│   |   ├── MainActivity.ky
│   |   └── viewpager
│   |       └── HomeViewPagerFragment.kt
│   ├── paging
│   |   ├── PopularPagingSource.kt
│   |   ├── SearchPagingSource.kt
│   |   ├── TopRatedPagingSource.kt
│   |   └── UpcomingPagingSource.kt 
│   └── search
│       ├── SearchFragment.kt
│       └── SearchViewModel.kt
└── utils
    ├── ActivityUtils.kt 
    ├── CONSTANTS.kt
    ├── FragmentUtils.kt
    ├── NetworkUtils.kt
    ├── PlaceHolderUtils.kt
    ├── TimeUtils.kt
    └── ViewUtils.kt
```
