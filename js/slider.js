	const images = [
    'img/img1.jpg',
    'img/img2.jpg',
    'img/img3.jpg',
    'img/img4.jpg',
    'img/img5.jpg',
    'img/img6.jpg'
];

let currentIndex = 0;

const sliderImage = document.getElementById('sliderImage');
const prevBtn = document.getElementById('prevBtn');
const nextBtn = document.getElementById('nextBtn');

function updateImage() {
    sliderImage.src = images[currentIndex];
}

prevBtn.addEventListener('click', function() {
    if (currentIndex === 0) {
        currentIndex = images.length - 1; // Go to last image if at the beginning
    } else {
        currentIndex--;
    }
    updateImage();
});

nextBtn.addEventListener('click', function() {
    if (currentIndex === images.length - 1) {
        currentIndex = 0;
    } else {
        currentIndex++;
    }
    updateImage();
});

updateImage();
