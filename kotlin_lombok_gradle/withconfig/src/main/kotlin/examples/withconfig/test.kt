package examples.withconfig

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SomeObj(
    val hidden: Boolean,
    val names: List<String>
)
