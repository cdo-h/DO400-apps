module.exports = function greet(name) {
    return `Hello ${name || "guest"} from version2!`;
}