import SearchBar from "./SearchBar";

export default function JobOffers() {
    return (
        <div className="bg-black w-full min-h-screen md:-mt-15 z-20 absolute">
            <div className="max-w-7xl mx-auto px-10 relative -mt-13 z-30 mb-20">
                <SearchBar/>
            </div>
        </div>
    );
}