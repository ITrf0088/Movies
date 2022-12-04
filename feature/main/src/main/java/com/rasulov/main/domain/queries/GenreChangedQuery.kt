package com.rasulov.main.domain.queries

import com.rasulov.feature.domain.base.enums.Language
import com.rasulov.feature.domain.base.queries.BaseQuery
import com.rasulov.main.domain.enums.SortBy

class GenreChangedQuery(
    val genreId: Int,
    val sortBy: SortBy
) : BaseQuery(Language.NONE)