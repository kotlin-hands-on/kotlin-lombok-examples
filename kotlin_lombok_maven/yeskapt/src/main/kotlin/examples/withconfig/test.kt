package examples.withconfig

import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi

@JsonClass(generateAdapter = true)
data class SomeObj(
    val hidden: Boolean,
    val names: List<String>
)
