SELECT
        VIDEO
        ,COUNT(*) AS CNT
        ,MAX(CREATE_AT) AS CREATE_AT
    FROM
        CHANNEL_LOG
    WHERE
        CHANNEL_ID = /*CHANNEL_ID*/1
    GROUP BY
        VIDEO
    ORDER BY
        CNT DESC