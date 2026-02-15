const itemLayout = (() => {
    const showItemDescImages = (itemImages) => {
        // 상품 설명 이미지 div
        const allInfoImageDiv = document.querySelector(".story-card-inner");
        // 상품 소개 ~ 교환/환불 div
        const descInfoDiv = allInfoImageDiv.querySelector("div[name=item-desc]");
        const sellerInfoDiv = allInfoImageDiv.querySelector("div[name=item-seller]");
        const refundInfoDiv = allInfoImageDiv.querySelector("div[name=item-refund]");

        const itemDescImages = itemImages.itemDescImages;
        const itemSellerImages = itemImages.itemSellerImages;
        const itemRefundImages = itemImages.itemRefundImages;

        let text = ``;
        // 상품 소개 이미지 뿌리기
        itemDescImages.forEach((image) => {
            const srcPath = `/api/files/display?filePath=${encodeURIComponent(image.fileSavedPath)}&fileName=${encodeURIComponent(image.fileName)}`;

            text += `
                <img src="${srcPath}" alt="desc" class="story-content-img">
            `;
        });
        descInfoDiv.innerHTML = text;
        text = ``;

        // 상품 판매자 이미지 뿌리기
        itemSellerImages.forEach((image) => {
            const srcPath = `/api/files/display?filePath=${encodeURIComponent(image.fileSavedPath)}&fileName=${encodeURIComponent(image.fileName)}`;

            text += `
                <img src="${srcPath}" alt="seller" class="story-content-img">
            `;
        });
        sellerInfoDiv.innerHTML = text;
        text = ``;

        // 상품 교환/환불 이미지 뿌리기
        itemRefundImages.forEach((image) => {
            const srcPath = `/api/files/display?filePath=${encodeURIComponent(image.fileSavedPath)}&fileName=${encodeURIComponent(image.fileName)}`;

            text += `
                <img src="${srcPath}" alt="refund" class="story-content-img">
            `;
        });
        refundInfoDiv.innerHTML = text;
        text = ``;
    }

    const showItemReviews = (reviews) => {

    }

    return {
        showItemDescImages: showItemDescImages,
        showItemReviews: showItemReviews
    };
})();