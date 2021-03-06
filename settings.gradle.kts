include(
    ":android-app",
    ":mpp-library",
    ":mpp-library:domain",
    ":mpp-library:feature:list",
    ":mpp-library:library:newsApi"
)

private val isLocalDependencies = true

if (isLocalDependencies) {

    include(":kmp-clean-mvvm-arch")
    project(":kmp-clean-mvvm-arch").projectDir =
        File(rootDir.parent, "merseykmplibrary/kmp-clean-mvvm-arch")

    include(":kmp-utils")
    project(":kmp-utils").projectDir =
        File(rootDir.parent, "merseykmplibrary/kmp-utils")

    include(":utils")
    project(":utils").projectDir =
        File(rootDir.parent, "mersey-android-library/utils")

    include(":animators")
    project(":animators").projectDir =
        File(rootDir.parent, "mersey-android-library/animators")

    include(":archy")
    project(":archy").projectDir =
        File(rootDir.parent, "mersey-android-library/archy")

    include(":adapters")
    project(":adapters").projectDir =
        File(rootDir.parent, "mersey-android-library/adapters")

}
include(":mpp-library:templateModule")
