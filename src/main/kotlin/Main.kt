fun main() {
    WallService.add(Post(ownerId = 1, text = "14120"))
    //Thread.sleep(1000)
    WallService.add(Post(ownerId = 1, text = "132249"))
    WallService.add(Post(ownerId = 2, text = "141303"))
    WallService.add(Post(ownerId = 2, text = "402010"))

    WallService.add(Post(ownerId = 3, text = "222222", likes = Likes(canLike = true)))

    WallService.update(Post(id = 2, text = "replaced", comments = Comments(canClose = true)))
    WallService.update(Post(id = 1, text = "new text", comments = Comments(canOpen = true), canPin = false))

    println(WallService)
}