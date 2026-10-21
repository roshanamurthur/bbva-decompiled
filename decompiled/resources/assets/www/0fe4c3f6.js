import{z as t,L as e,ak as s,h as i,C as n}from"./952f98a9.js";var h=t`:host {
  display: inline-flex;
  justify-content: center;
  align-items: center;
  position: relative;
  vertical-align: middle;
  fill: var(--cells-icon-fill-color, currentcolor);
  stroke: var(--cells-icon-stroke-color, none);
  width: var(--cells-icon-width, var(--cells-icon-size, var(--cells-icon-svg-width, 1.5rem)));
  height: var(--cells-icon-height, var(--cells-icon-size, var(--cells-icon-svg-height, 1.5rem)));
  @apply --cells-icon; }

:host([hidden]), [hidden] {
  display: none !important; }
`;class c extends e{static get is(){return"cells-icon"}static get shadyStyles(){return`\n      ${h.cssText}\n      ${s("cells-icon-shared-styles").cssText}\n    `}render(){return i`
      <style>${this.constructor.shadyStyles}</style>
      <slot></slot>
    `}static get properties(){return{icon:{type:String},theme:{type:String},src:{type:String},size:{type:Number},width:{type:Number},height:{type:Number},_isAttached:{type:Boolean}}}constructor(){super(),this._iconsetListenerCallback=this._updateIcon.bind(this),this._meta=new n({type:"iconset"})}connectedCallback(){super.connectedCallback(),this._isAttached=!0}disconnectedCallback(){super.disconnectedCallback(),this._isAttached=!1}get _DEFAULT_ICONSET(){return"icons"}updated(t){(t.has("_meta")||t.has("theme")||t.has("_isAttached"))&&this._updateIcon(),(t.has("src")||t.has("_isAttached"))&&this._srcChanged(this.src),(t.has("icon")||t.has("_isAttached"))&&this._iconChanged(this.icon),t.has("size")&&this.style.setProperty("--cells-icon-size",this.size/16+"rem"),t.has("width")&&this.style.setProperty("--cells-icon-svg-width",this.width/16+"rem"),t.has("height")&&this.style.setProperty("--cells-icon-svg-height",this.height/16+"rem")}_iconChanged(t){if(void 0!==t&&"undefined"!==t){var e=(t||"").split(":");this._iconName=e.pop(),this._iconsetName=e.pop()||this._DEFAULT_ICONSET,this._updateIcon()}}_srcChanged(){this._updateIcon()}_usesIconset(){return this.icon||!this.src}_updateIcon(){this._usesIconset()?(this._img&&this._img.parentNode&&this.removeChild(this._img),""===this._iconName?this._iconset&&this._iconset.removeIcon(this):this._iconsetName&&this._meta&&(this._iconset=this._meta.byKey(this._iconsetName),this._iconset?(this._iconset.applyIcon(this,this._iconName,this.theme),window.removeEventListener("iron-iconset-added",this._iconsetListenerCallback)):window.addEventListener("iron-iconset-added",this._iconsetListenerCallback))):(this._iconset&&this._iconset.removeIcon(this),this._img||(this._img=document.createElement("img"),this._img.style.width="100%",this._img.style.height="100%",this._img.draggable=!1),this._img.src=this.src,this.appendChild(this._img))}}customElements.define(c.is,c);
