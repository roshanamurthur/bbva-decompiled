import"./216055dc.js";import{z as t,a8 as e,a9 as a,bj as i,ac as n,ab as s,ad as r,ar as o,aa as c,b0 as d,L as h,ak as l,h as v,an as g}from"./952f98a9.js";import"./7f3d7ca9.js";import"./b695a77f.js";import"./c0a2f832.js";import"./cae0f1de.js";var m=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

.signature-container {
  width: 100%;
  height: 92vh;
}

.ios-sign-height {
  height: 85vh;
}

:host(.fixed-position) .signature-container {
  position: fixed;
}

.sign-container {
  margin: 1rem;
  display: flex;
  align-items: stretch;
  height: calc(100% - 120px);
  background-color: var(--bbva-gema-autograph-signature-bg-color, var(--colorsSecondary100, ${e(a.secondary100)}));
}
.sign-container .drawerContainer {
  position: fixed;
  width: calc(100% - 32px);
  height: calc(100% - 190px);
  z-index: 2;
}

.legend-container {
  top: 10;
  display: flex;
  padding: 0.625rem 1.4375rem;
  position: absolute;
  align-items: center;
  justify-content: center;
  width: calc(100% - 32px);
  height: calc(100vh - 98px);
  --bbva-panel-info-image-width: rem(80px);
}

.footer-container {
  bottom: 0;
  width: 100%;
  height: 6.625rem;
  display: flex;
  padding: 1.5rem 1rem;
  position: absolute;
  justify-content: center;
  background-color: var(--colorsPrimaryCoreLightened, ${e(a.primaryCoreLightened)});
  z-index: 10;
}

.button-secondary-margin {
  margin: var(--bbva-button-margin, 0.4375rem);
  border: 0;
  --bbva-button-default-secondary-bg-color-disabled: var(--colorsPrimaryCoreLightened, ${e(a.primaryCoreLightened)});
  --_button-default-color-disabled: var(--colorsPrimaryMedium, ${e(a.primaryMedium)});
}

.button-primary-margin {
  margin: var(--bbva-button-margin, 0.4375rem);
  --_default-border-color-secondary: var(--colorsPrimaryCoreLightened, ${e(a.primaryCoreLightened)});
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;customElements.define("bbva-core-heading",i);const p=new o;var b=t`:host {
  display: block;
  box-sizing: border-box;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(c.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(c.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(c.spacer)}))) / 16) * 1em);
  text-align: center;
  --_panel-info-title-color: var(--bbva-panel-info-title-color, var(--colorsSecondary600, ${e(a.secondary600)}));
  --_panel-info-text-color: var(--bbva-panel-info-text-color, var(--colorsSecondary600, ${e(a.secondary600)}));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host(.huge-image) {
  --bbva-panel-info-image-width: auto;
  --bbva-panel-info-image-height: 7rem;
}

::slotted(*), .image {
  width: var(--bbva-panel-info-image-width, 6.5rem);
  height: var(--bbva-panel-info-image-height, auto);
  margin: 0 auto calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(c.spacer)}))) / 16) * 1rem);
}

.panel-title {
  display: block;
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(c.spacer)}))) / 16) * 1rem) 0;
  color: var(--_panel-info-title-color);
  font-size: var(--typographyTypeLarge, ${e(n.typeLarge)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(s.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(s.medium.fontStyle)});
  line-height: var(--lineHeightTypeLarge, ${e(r.typeLarge)});
}

bbva-text {
  margin: 0 auto calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(c.spacer)}))) / 16) * 1rem);
  color: var(--_panel-info-text-color);
}
${p.mediaRules()}`;const u=new o;var x=t`[ambient^=light] {
  --bbva-panel-info-title-color: var(--colorsSecondary600, ${e(a.secondary600)});
  --bbva-panel-info-text-color: var(--colorsSecondary600, ${e(a.secondary600)});
}
${u.mediaRules()}`;const y=new o;var f=t`[ambient^=dark] {
  --bbva-panel-info-title-color: var(--colorsPrimaryCoreLightened, ${e(a.primaryCoreLightened)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${e(a.primaryCoreLightened)});
}
${y.mediaRules()}`;const C={light:t`
    ${d.light}
    ${x}
  `,dark:t`
    ${d.dark}
    ${f}
  `};class S extends h{static get is(){return"bbva-panel-info"}static get properties(){return{image:{type:String},imageAltText:{type:String,attribute:"image-alt-text"},heading:{type:String},headingLevel:{type:Number,attribute:"heading-level"},text:{type:String},linkText:{type:String,attribute:"link-text"}}}constructor(){super(),this.image="",this.imageAltText="",this.heading="",this.headingLevel=3,this.text="",this.linkText=""}static get styles(){return[b,l("bbva-panel-info-shared-styles"),C.light,C.dark]}render(){return v`
      ${this.image?v`
            <img id="image" class="image" src="${this.image}" alt="${this.imageAltText}" />
          `:v`
            <slot></slot>
          `}
      ${this.heading&&v`
          <bbva-core-heading id="pantitle" .level="${this.headingLevel}" class="panel-title">
            ${this.heading}
          </bbva-core-heading>
        `}
      <bbva-text
        text=${this.text}
        ?hidden="${!this.text}"
        size="S"
        alignment="center"
        unset
      ></bbva-text>
      <bbva-link @click="${this._buttonClickHandler}" ?hidden="${!this.linkText}">
        ${this.linkText}
      </bbva-link>
    `}_buttonClickHandler(){this.dispatchEvent(new CustomEvent("panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}}customElements.define(S.is,S);const w={createCanvas:(t,e)=>{const a=e?{font:"15px Arial",fillStyle:"#666666"}:{},i=document.createElement("canvas"),n=i.getContext("2d");return i.width=t.clientWidth,i.height=t.clientHeight,i.font=a.font,i.fillStyle=a.fillStyle,{canvas:i,context:n}},assignCanvas:t=>{t.canvas=t.shadowRoot.querySelector(".drawerContainer"),t.canvasContext=t.canvas.getContext("2d"),t.canvasContext.canvas.width=t.canvas.clientWidth,t.canvasContext.canvas.height=t.canvas.clientHeight},onLoadImage:(t,e,a,i,n,s,r)=>{const o=t;o.canvas.width=e.clientWidth-16,o.canvas.height=e.clientHeight/2,o.drawImage(a,0,i-15,n,s,0,0,r.width,r.height)}};class _ extends(g(h)){static get is(){return"bbva-widget-signature-pad"}static get properties(){return{canvasContext:{type:Object},mapper:{type:Object},canvas:{type:Object},coordinates:{type:Object},date:{type:String,attribute:"date"},authNumber:{type:String,attribute:"auth-number"},infoImage:{type:String,attribute:"info-image"},textPrimaryButton:{type:String,attribute:"text-positive-button"},textSecondaryButton:{type:String,attribute:"text-secondary-button"},dotFlag:{type:Boolean,attribute:"dot-flag"},isDrawing:{type:Boolean,attribute:"is-drawing"},resizeCanvas:{type:Boolean,attribute:"resize-canvas"},isNativeIos:{type:Boolean,attribute:"is-native-ios"}}}constructor(){super(),this.coordinates={prevX:0,prevY:0,currentX:0,currentY:0,minY:0,maxY:0},this.resizeCanvas=!1,this.isDrawing=!1,this.dotFlag=!1,this.date=moment(new Date).format("YYYY-MM-DD HH:mm"),this.authNumber="",this.infoImage="./images/remoteSignature.svg",this.textPrimaryButton="bbva-widget-signature-pad-text-primary-btn",this.textSecondaryButton="bbva-widget-signature-pad-text-secondary-btn",this.message="bbva-widget-signature-pad-message",this.canvasContext={},this.canvas={},this.mapper=w,this.isNativeIos=!1}static get styles(){return[m,l("bbva-widget-signature-pad-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),window.addEventListener("resize",this._removeSign.bind(this))}firstUpdated(t){super.firstUpdated(t),this._initializeCanvas();const e=this.renderRoot.querySelector(".sign-container");e.addEventListener("touchstart",this._validateInitCanvas.bind(this)),e.addEventListener("mousedown",this._validateInitCanvas.bind(this))}render(){return v`
      <div class="signature-container ${this.isNativeIos?"ios-sign-height":""}">
        <div class="sign-container">
          <canvas id="drawerContainer" class="drawerContainer"></canvas>
          <div class="legend-container" ?hidden="${this.dotFlag}">
            <bbva-panel-info image="${this.infoImage}" image-alt-text="Sign" text="${this.t(this.message)}">
            </bbva-panel-info>
          </div>
        </div>
        <div class="footer-container">
          <bbva-button-default
            class="button-secondary-margin"
            variant="secondary"
            text="${this.t(this.textSecondaryButton)}"
            @click="${this._eraseSign}"
            ?disabled="${!this.dotFlag}"></bbva-button-default>
          <bbva-button-default
            class="button-primary-margin"
            text="${this.t(this.textPrimaryButton)}"
            @click="${this._startSaveProccess}"
            ?disabled="${!this.dotFlag}"></bbva-button-default>
        </div>
      </div>
    `}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),window.removeEventListener("resize",this._removeSign.bind(this),!1)}_refreshCanvas(){this.resizeCanvas=!1,this.coordinates={prevX:0,prevY:0,currentX:0,currentY:0,minY:0,maxY:0}}_validateInitCanvas(){this.resizeCanvas||(this._initializeCanvas(),this.resizeCanvas=!0)}_initializeCanvas(){this.mapper.assignCanvas(this),this._setEventListener("touchmove","move"),this._setEventListener("touchstart","down"),this._setEventListener("touchend","up"),this._setEventListener("touchleave","out"),this._setEventListener("mousemove","move"),this._setEventListener("mousedown","down"),this._setEventListener("mouseup","up"),this._setEventListener("mouseout","out")}_setCoordinates(t,e){"down"===t&&(this._updateCoordinates(e),this.isDrawing=!0,this.dotFlag=!0),"up"!==t&&"out"!==t||(this.isDrawing=!1),"move"===t&&this.isDrawing&&(this._updateCoordinates(e),this._drawSign())}static _validateMaxMin(t=0,e=0,a="min"){return"min"===a?t>e?e:t:t<e?e:t}_updateCoordinates(t){this.coordinates.prevX=this.coordinates.currentX,this.coordinates.prevY=this.coordinates.currentY,this.coordinates.currentX=(t.changedTouches?t.changedTouches[0].clientX:t.clientX)-this.canvas.offsetLeft,this.coordinates.currentY=(t.changedTouches?t.changedTouches[0].clientY:t.clientY)-this.canvas.offsetTop,this.coordinates.minY=0===this.coordinates.minY?this.coordinates.prevY:_._validateMaxMin(this.coordinates.minY,this.coordinates.currentY,"min"),this.coordinates.maxY=0===this.coordinates.maxY?this.coordinates.prevY:_._validateMaxMin(this.coordinates.maxY,this.coordinates.currentY,"max")}_drawSign(){this.canvasContext.beginPath(),this.canvasContext.moveTo(this.coordinates.prevX,this.coordinates.prevY),this.canvasContext.lineTo(this.coordinates.currentX,this.coordinates.currentY),this.canvasContext.strokeStyle="black",this.canvasContext.lineWidth=2,this.canvasContext.stroke(),this.canvasContext.closePath()}async _removeSign(){this.mapper.assignCanvas(this),this.canvasContext.clearRect(0,0,this.canvas.clientWidth,this.canvas.clientHeight),this.dotFlag=!1,await this.updateComplete}_drawText(t){let e=0;for(let a=t.posX;a<=this.canvas.clientWidth;a+=10)e>t.text.length-1&&(e=0,a+=10),t.canvasContext.fillText(t.text.charAt(e),a,t.posY),e+=1}_startSaveProccess(){const t=this.canvas.clientWidth-16,e=this.coordinates.maxY-this.coordinates.minY+30,a=this.mapper.createCanvas(this.canvas),i=new Image;i.onload=()=>{this.mapper.onLoadImage(a.context,this.canvas,i,this.coordinates.minY,t,e,a.canvas),this._createWaterMark(a.canvas.toDataURL(),t,e)},i.src=this.canvas.toDataURL()}_createWaterMark(t,e,a){const i=this.mapper.createCanvas(this.canvas,!0);this.authNumber=`${this.t("bbva-widget-signature-pad-auth-number")}: ${this.authNumber}`;const n=Math.trunc(this.canvas.clientHeight/15);let s=20;for(let t=1;t<=n;t+=1){const e={canvasContext:i.context,text:t%2>0?this.date:this.authNumber,posX:t%2>0?20:10,posY:s};this._drawText(e),s+=15}const r=new Image;r.onload=()=>{this.canvasContext.drawImage(r,0,0,e,a,0,this.coordinates.minY-20,e,a),this._addWatermarkToSign({sign:t,signWithWatermark:this.canvas.toDataURL()},e,a)},r.src=i.canvas.toDataURL()}_addWatermarkToSign(t,e,a){this._removeSign();const i=new Image;i.onload=()=>{this.mapper.onLoadImage(this.canvasContext,this.canvas,i,this.coordinates.minY,e,a,this.canvas);const n=t;n.signWithWatermark=this.canvas.toDataURL(),this._saveSign(n)},i.src=t.signWithWatermark}_saveSign(t){this.canvas=this.shadowRoot.querySelector(".drawerContainer"),this._removeSign(),this._refreshCanvas(),this._customDispatch("save-sign",t)}_eraseSign(){this._removeSign(),this._refreshCanvas()}_customDispatch(t,e){const a=new CustomEvent(t,{bubbles:!0,composed:!0,detail:e});this.dispatchEvent(a)}_setEventListener(t,e){this.canvas.addEventListener(t,(t=>{this._setCoordinates(e,t)}),!1)}}customElements.define(_.is,_);
